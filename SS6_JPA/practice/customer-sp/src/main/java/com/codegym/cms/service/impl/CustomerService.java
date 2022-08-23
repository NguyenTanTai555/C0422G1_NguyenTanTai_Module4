package com.codegym.cms.service.impl;

import com.codegym.cms.model.Customer;
import com.codegym.cms.repository.ICustomerRepository;
import com.codegym.cms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        return iCustomerRepository.insertWithStoredProcedure(customer);
    }
}
