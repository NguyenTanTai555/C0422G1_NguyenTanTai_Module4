package com.codegym.case_study.repository;

import com.codegym.case_study.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {

}
