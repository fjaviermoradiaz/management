package com.es.enterprise.management.service;

import com.es.enterprise.management.domain.Customer;
import com.es.enterprise.management.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Object findAll(){
        return customerRepository.findAll();
    }

    public Customer findById(Long id){
        return customerRepository.findOne(id);
    }

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }
}
