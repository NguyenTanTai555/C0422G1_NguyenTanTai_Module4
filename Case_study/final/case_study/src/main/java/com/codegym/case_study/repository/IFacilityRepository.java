package com.codegym.case_study.repository;

import com.codegym.case_study.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface IFacilityRepository extends JpaRepository<Facility,Long> {
    Page<Facility> findAllByNameContaining(String name, Pageable pageable);

    Page<Facility> findAllByFacilityId_Id(Long id ,Pageable pageable);
}
