package com.codegym.registrationform.unit;

import com.codegym.registrationform.dto.UserDto;

import java.time.LocalDate;

public class DataTimeUtil {
    public static boolean checkAge(UserDto userDto) {
        LocalDate now = LocalDate.now();
        Integer countAge = (now.getYear() - userDto.getAge().getYear());
        if (countAge < 18 || countAge > 100) {
            return false;
        } else {
            return true;
        }
    }
}
