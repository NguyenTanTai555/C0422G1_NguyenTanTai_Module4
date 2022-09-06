package com.codegym.case_study.service;

import com.codegym.case_study.model.contract.AttachFacility;
import com.codegym.case_study.model.contract.Contract;
import com.codegym.case_study.model.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
    Page<Contract> listContract(String facilityName, Pageable pageable);

    void saveContractDetail(ContractDetail contractDetail);

    void saveContract(Contract contract);

    void deleteContract(Long id);

    Contract findById(Long id);

    List<AttachFacility> listAttachFacility();
}
