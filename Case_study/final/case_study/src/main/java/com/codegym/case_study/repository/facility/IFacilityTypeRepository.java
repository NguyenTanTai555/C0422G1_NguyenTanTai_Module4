package com.codegym.case_study.repository.facility;

import com.codegym.case_study.model.facility.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacilityTypeRepository extends JpaRepository<FacilityType, Long> {
}
