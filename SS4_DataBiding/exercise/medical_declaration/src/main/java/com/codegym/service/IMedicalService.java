package com.codegym.service;

import java.util.List;

public interface IMedicalService {
    List<String> showDayList();

    List<String> showMonthList();

    List<String> showYearList();

    List<String> genderList();

    List<String> nationalityList();

    List<String> yearOfBirthList();

    List<String> informationList();
}
