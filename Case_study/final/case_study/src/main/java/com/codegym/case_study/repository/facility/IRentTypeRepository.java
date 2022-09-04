package com.codegym.case_study.repository.facility;

import com.codegym.case_study.model.facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentTypeRepository extends JpaRepository<RentType, Long> {
}
