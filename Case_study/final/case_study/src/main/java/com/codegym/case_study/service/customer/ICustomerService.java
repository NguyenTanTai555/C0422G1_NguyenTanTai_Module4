package com.codegym.case_study.service.customer;

import com.codegym.case_study.model.person.customer.Customer;
import com.codegym.case_study.model.person.customer.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAllCustomer(String name , String customerType, Pageable pageable);
    void saveCustomer(Customer customer);
    Customer findByIdCustomer(Integer id);
    void deleteCustomer(Integer id);
    List<CustomerType> findAllCustomerType();
}
