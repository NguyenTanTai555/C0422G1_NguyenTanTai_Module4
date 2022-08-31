package com.codegym.case_study.service.customer.impl;

import com.codegym.case_study.model.person.customer.Customer;
import com.codegym.case_study.model.person.customer.CustomerType;
import com.codegym.case_study.repository.ICustomerRepository;
import com.codegym.case_study.repository.ICustomerTypeRepository;
import com.codegym.case_study.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private ICustomerTypeRepository customerTypeRepository;

    @Override
    public Page<Customer> findAllCustomer(String name, String customerType, Pageable pageable) {
        return customerRepository.findAllByNameContainingAndCustomerType_CustomerTypeNameContaining(name, customerType, pageable);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findByIdCustomer(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.delete(findByIdCustomer(id));
    }

    @Override
    public List<CustomerType> findAllCustomerType() {
        return customerTypeRepository.findAll();
    }
}
