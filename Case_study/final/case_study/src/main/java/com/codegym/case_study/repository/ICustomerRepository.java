package com.codegym.case_study.repository;

import com.codegym.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
    Page<Customer> findAllByNameContainingAndTypeCustomer_TypeNameCustomerContaining(String name , String typeCustomer, Pageable pageable);
}
