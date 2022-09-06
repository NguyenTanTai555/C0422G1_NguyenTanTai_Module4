package com.codegym.case_study.controller;

import com.codegym.case_study.dto.contract.ContractDetailDto;
import com.codegym.case_study.model.contract.Contract;
import com.codegym.case_study.model.contract.ContractDetail;
import com.codegym.case_study.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/contracts")
public class ContractController {

    @Autowired
    private IContractService iContractService;

    @GetMapping("")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("contract/list");
        return modelAndView;
    }

    @GetMapping("/list")
    public ModelAndView listFacility(@PageableDefault(size = 3) Pageable pageable,
                                     @RequestParam Optional<String> facilityName){
        ModelAndView modelAndView = new ModelAndView("contract/list");
        String keyName = facilityName.orElse("");
        Page<Contract> contracts = iContractService.listContract(keyName,pageable);
        Map<Long,Double> map = new HashMap<>();
        double total;
        for (Contract contract : contracts) {
                total = 0 ;
            for (ContractDetail contractDetail: contract.getContractDetail()) {
                total += (contractDetail.getQuantity()*contractDetail.getAttachFacility().getCost());
            }
            map.put(contract.getId(),total);
        }
        modelAndView.addObject("attachFacility", iContractService.listAttachFacility());
        modelAndView.addObject("contractDetailDto", new ContractDetailDto());
        modelAndView.addObject("total", map);
        modelAndView.addObject("contractPage", contracts);
        modelAndView.addObject("keyName", keyName);
        return modelAndView;
    }
}
