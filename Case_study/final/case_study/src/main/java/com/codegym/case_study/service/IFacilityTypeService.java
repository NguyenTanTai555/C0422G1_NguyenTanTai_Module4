package com.codegym.case_study.service;

import com.codegym.case_study.model.facility.FacilityType;

import java.util.List;

public interface IFacilityTypeService {
    List<FacilityType> findAll();
}
