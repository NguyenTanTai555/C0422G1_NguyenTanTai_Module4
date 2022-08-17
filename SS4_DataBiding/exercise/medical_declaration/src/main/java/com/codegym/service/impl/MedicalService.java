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
        return null;
    }

    @Override
    public List<String> showMonthList() {
        return null;
    }

    @Override
    public List<String> showYearList() {
        return null;
    }

    @Override
    public List<String> genderList() {
        return null;
    }

    @Override
    public List<String> nationalityList() {
        return null;
    }

    @Override
    public List<String> yearOfBirthList() {
        return null;
    }

    @Override
    public List<String> informationList() {
        return null;
    }
}
