package com.codegym.case_study.repository;

import com.codegym.case_study.model.contract.AttachFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface IAttachFacilityRepository extends JpaRepository<AttachFacility , Long> {
}
