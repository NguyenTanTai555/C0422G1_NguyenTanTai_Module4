package com.codegym.case_study.service.impl;

import com.codegym.case_study.model.employee.Employee;
import com.codegym.case_study.repository.IEmployeeRepository;
import com.codegym.case_study.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeRepository iEmployeeRepository;
    @Override
    public List<Employee> listEmployee() {
        return this.iEmployeeRepository.findAll();
    }
}
