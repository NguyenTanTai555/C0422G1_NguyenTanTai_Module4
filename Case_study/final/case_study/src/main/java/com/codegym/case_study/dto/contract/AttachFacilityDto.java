package com.codegym.case_study.dto.contract;

import com.codegym.case_study.model.contract.ContractDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AttachFacilityDto implements Validator {
    @NotBlank
    @NotNull
    private Long id;
    @NotBlank
    private String name;
    private double cost;
    private String unit;
    private String status;
    private List<ContractDetail> contractDetails;

    public AttachFacilityDto(String name, double cost, String unit, String status, List<ContractDetail> contractDetails) {
        this.name = name;
        this.cost = cost;
        this.unit = unit;
        this.status = status;
        this.contractDetails = contractDetails;
    }
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
