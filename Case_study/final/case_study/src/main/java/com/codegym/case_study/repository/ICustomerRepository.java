package com.codegym.case_study.repository;

import com.codegym.case_study.model.person.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findAllByNameContainingAndCustomerType_CustomerTypeNameContaining(String name, String customerType, Pageable pageable);
}
