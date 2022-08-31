package com.codegym.case_study.model.person.employee;

import com.codegym.case_study.model.person.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee  extends Person {
    private Double salary;
    @ManyToOne
    @JoinColumn(name = "idPosition" ,referencedColumnName = "idPosition",nullable = false)
    private Position position;

    @ManyToOne
    @JoinColumn(name = "idDivision",referencedColumnName = "idDivision",nullable = false)
    private Division division;

    @ManyToOne
    @JoinColumn(name = "idEducation",referencedColumnName = "idEducation",nullable = false)
    private EducationDegree educationDegree;
}
