package com.codegym.repository;

import com.codegym.model.Medical;

import java.util.List;

public interface IMedicalRepository {
    List<String> showDayList();

    List<String> showMonthList();

    List<String> showYearList();

    List<String> genderList();

    List<String> nationalityList();

    List<String> yearOfBirthList();

    List<String> informationList();

    List<Medical> showMedical();

    void save(Medical medical);

    Medical findById(int medicalId);

    void update(int medicalId, Medical medical);
}
