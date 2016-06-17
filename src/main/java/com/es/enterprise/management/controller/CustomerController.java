package com.es.enterprise.management.controller;

import com.es.enterprise.management.domain.Customer;
import com.es.enterprise.management.form.CustomerForm;
import com.es.enterprise.management.service.impl.CustomerService;
import com.es.enterprise.management.service.impl.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"","/customer"})
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private PersonService personService;

    @RequestMapping(value = {"/customer","index"})
    public String index(Model model){
        model.addAttribute("customerList", customerService.findAll());
        return "customer/index";
    }

    @RequestMapping(value = "create")
    public String create(Model model){

        model.addAttribute("personList",personService.findAll());
        model.addAttribute("customerForm",new CustomerForm());

        return "customer/create";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(CustomerForm customerForm){
        Customer customer = new Customer();
        customer.setName(customerForm.name);
        customer.setAddress(customerForm.address);
        customer.setArea(customerForm.area);
        customer.setContact(personService.findById(customerForm.contact));
        customer.setCreationDate(customerForm.creationDate);
        customer.setDescription(customerForm.description);
        customer.setLocked(customerForm.locked);
        customer.setPhone(customerForm.phone);

        customerService.save(customer);
        return "redirect:index";
    }
/*
    @RequestMapping(value = "edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        //model.addAttribute("person", employeeService.findById(id));
        return "employee/edit";
    }


    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:list";
    }


    @RequestMapping(value = {"/new","new"})
    public String newEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        model.addAttribute("edit", false);
        return "employee/new";
    }

    @RequestMapping(value = "/test")
    public String test(){
        return " hello world";
    }*/


}