package com.es.enterprise.management.service;

import com.es.enterprise.management.domain.Employee;
import com.es.enterprise.management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Object findAll(){
        return employeeRepository.findAll();
    }

    public Employee findById(Long id){
        return employeeRepository.findOne(id);
    }

    public Employee save(Employee person){
        return employeeRepository.save(person);
    }
}
