package com.codegym.case_study.repository;

import com.codegym.case_study.model.customer.TypeCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITypeCustomerRepository extends JpaRepository<TypeCustomer,Long> {
}
