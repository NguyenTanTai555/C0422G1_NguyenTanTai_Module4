package com.codegym.case_study.repository.customer;

import com.codegym.case_study.model.person.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ICustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
