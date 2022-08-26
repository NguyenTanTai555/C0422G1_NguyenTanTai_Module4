package com.codegym.registrationform.dto;

import com.codegym.registrationform.unit.DataTimeUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Validator {
    @NotBlank(message = "Please Enter your first name")
    @Size(min = 5, max = 45)
    private String firstName;

    @NotBlank(message = "Please Enter last name")
    @Size(min = 5, max = 45)
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate age;

    @NotBlank
    @Pattern(regexp = "^(84|0[3|5|7|8|9])+([0-9]{8})$", message = "Please enter Right format!!!")
    private String phone;

    @NotBlank(message = "Please Enter your mail")
    @Email
    private String email;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        try {
            UserDto userDto = (UserDto) target;
            if (!DataTimeUtil.checkAge(userDto)) {
                errors.rejectValue("age", "age.err", "wrong format");
            }
        } catch (Exception e) {
            errors.rejectValue("age", "age.err", "Do not null");
        }

    }
}