package com.codegym.customer_management.repository;

import com.codegym.customer_management.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Integer> {
}
