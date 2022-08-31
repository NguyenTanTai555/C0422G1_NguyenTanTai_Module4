package com.codegym.case_study.model.person.customer;

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
@Table(name = "customer")
public class Customer extends Person {
    private Boolean gender;

    @ManyToOne
    @JoinColumn(name = "customerTypeId",referencedColumnName = "customerTypeId",nullable = false)
    private CustomerType customerType;
}
