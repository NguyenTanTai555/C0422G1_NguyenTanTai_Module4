package com.codegym.repository.impl;

import com.codegym.repository.IMedicalRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepository implements IMedicalRepository {

    private static List<String> dayList = new ArrayList<>();

    private static List<String> monthList = new ArrayList<>();

    private static List<String> yearList = new ArrayList<>();

    private static List<String> genderList = new ArrayList<>();

    private static List<String> nationalityList = new ArrayList<>();

    private static List<String> yearOfBirthList = new ArrayList<>();

    private static List<String> informationList = new ArrayList<>();

    static {

        nationalityList.add("Viet Nam");
        nationalityList.add("American");
        nationalityList.add("China");
        nationalityList.add("Japan");
        nationalityList.add("Canada");

        genderList.add("Male");
        genderList.add("Female");

        informationList.add("plane");
        informationList.add("boat");
        informationList.add("car");

        for (int i = 1985; i < 2022 ; i++) {
            yearOfBirthList.add(String.valueOf(i));
        }

        for (int i = 1; i <= 31; i++) {
            dayList.add(String.valueOf(i));
        }

        for (int i = 0; i <= 12; i++) {
            monthList.add(String.valueOf(i));
        }

        for (int i = 1900; i <= 2222; i++) {
            yearList.add(String.valueOf(i));
        }
    }

    @Override
    public List<String> showDayList() {
        return dayList;
    }

    @Override
    public List<String> showMonthList() {
        return monthList;
    }

    @Override
    public List<String> showYearList() {
        return yearList;
    }

    @Override
    public List<String> genderList() {
        return genderList;
    }

    @Override
    public List<String> nationalityList() {
        return nationalityList;
    }

    @Override
    public List<String> yearOfBirthList() {
        return yearOfBirthList;
    }

    @Override
    public List<String> informationList() {
        return informationList;
    }
}
