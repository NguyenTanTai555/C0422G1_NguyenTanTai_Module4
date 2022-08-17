package com.codegym.service.impl;


import com.codegym.repository.IMedicalRepository;
import com.codegym.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalService implements IMedicalService {
    @Autowired
    IMedicalRepository iMedicalRepository;

    @Override
    public List<String> showDayList() {
        return this.iMedicalRepository.showDayList();
    }

    @Override
    public List<String> showMonthList() {
        return this.iMedicalRepository.showMonthList();
    }

    @Override
    public List<String> showYearList() {
        return this.iMedicalRepository.showYearList();
    }

    @Override
    public List<String> genderList() {
        return this.iMedicalRepository.genderList();
    }

    @Override
    public List<String> nationalityList() {
        return this.iMedicalRepository.nationalityList();
    }

    @Override
    public List<String> yearOfBirthList() {
        return this.iMedicalRepository.yearOfBirthList();
    }

    @Override
    public List<String> informationList() {
        return this.iMedicalRepository.informationList();
    }
}
