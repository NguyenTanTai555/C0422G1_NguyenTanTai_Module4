package com.codegym.case_study.dto.facility;

import com.codegym.case_study.model.contract.Contract;
import com.codegym.case_study.model.facility.FacilityType;
import com.codegym.case_study.model.facility.RentType;
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
@AllArgsConstructor
@NoArgsConstructor
public class FacilityDto implements Validator {
    private Long id;
    private String name;
    private double cost;
    private int maxPeople;
    private int area;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private double poolArea;
    private int numberOfFloors;
    private String facilityFree;
    private FacilityType facilityId;
    private RentType rentType;
    private List<Contract> contractList;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
