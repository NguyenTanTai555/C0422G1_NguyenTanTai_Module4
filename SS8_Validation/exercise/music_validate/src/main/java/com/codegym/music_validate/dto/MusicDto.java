package com.codegym.music_validate.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MusicDto implements Validator {
    @NotBlank(message = "cannot be left blank")
    @Size(max = 800,message = "Do not > 800 character")
    @Pattern(regexp = "^[A-Za-z ]+$",message = "Enter Wrong format")
    private String musicName;

    @NotBlank(message = "cannot be left blank")
    @Size(max = 300 , message = "Can not > 300 character")
    @Pattern(regexp = "^(([A-Z][a-z]+\\s?){1,5})$" ,message = "Enter Wrong format")
    private String artist;

    @NotBlank(message = "cannot be left blank")
    @Size(max = 1000,message = "Do not > 1000 character")
    @Pattern(regexp = "^([A-Za-z ,]+)$" ,message = "Enter Wrong format")
    private String type;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
