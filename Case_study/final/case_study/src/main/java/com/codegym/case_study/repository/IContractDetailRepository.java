package com.codegym.case_study.repository;

import com.codegym.case_study.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface IContractDetailRepository extends JpaRepository<ContractDetail,Long> {
    List<ContractDetail> findByContract_Id(Long contractId);
}
