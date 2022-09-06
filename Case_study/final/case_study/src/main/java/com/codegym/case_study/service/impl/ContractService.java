package com.codegym.case_study.service.impl;

import com.codegym.case_study.model.contract.AttachFacility;
import com.codegym.case_study.model.contract.Contract;
import com.codegym.case_study.model.contract.ContractDetail;
import com.codegym.case_study.repository.IAttachFacilityRepository;
import com.codegym.case_study.repository.IContractDetailRepository;
import com.codegym.case_study.repository.IContractRepository;
import com.codegym.case_study.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContractService implements IContractService {

    @Autowired
    private IContractRepository iContractRepository ;

    @Autowired
    private IContractDetailRepository iContractDetailRepository;

    @Autowired
    private IAttachFacilityRepository iAttachFacilityRepository;

    @Override
    public Page<Contract> listContract(String facilityName, Pageable pageable) {
        return iContractRepository.findAllByFacility_NameContaining(facilityName, pageable);
    }

    @Override
    public void saveContractDetail(ContractDetail contractDetail) {
        iContractDetailRepository.save(contractDetail);
    }

    @Override
    public void saveContract(Contract contract) {
        iContractRepository.save(contract);
    }

    @Override
    public void deleteContract(Long id) {
        iContractRepository.deleteById(id);
    }

    @Override
    public Contract findById(Long id) {
        return iContractRepository.findById(id).orElse(null);
    }

    @Override
    public List<AttachFacility> listAttachFacility() {
        return iAttachFacilityRepository.findAll();
    }
}
