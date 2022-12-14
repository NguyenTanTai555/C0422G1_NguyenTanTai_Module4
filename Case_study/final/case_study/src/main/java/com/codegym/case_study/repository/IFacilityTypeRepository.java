package com.codegym.case_study.repository;

import com.codegym.case_study.model.facility.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface IFacilityTypeRepository extends JpaRepository<FacilityType,Long> {
}
