package com.es.enterprise.management.controller;

import com.es.enterprise.management.domain.Employee;
import com.es.enterprise.management.form.EmployeeForm;
import com.es.enterprise.management.service.EmployeeService;
import com.es.enterprise.management.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {"","/employee"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private PersonService personService;

    @RequestMapping(value = {"/employee","index"})
    public String index(Model model){
        model.addAttribute("employeeList", employeeService.findAll());
        return "employee/index";
    }

    @RequestMapping(value = "create")
    public String create(Model model){

        model.addAttribute("candidateList",personService.findAll());
        model.addAttribute("employeeForm",new EmployeeForm());

        return "employee/create";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(EmployeeForm employeeForm){
        Employee employee = new Employee();
        employee.setJoiningDate(employeeForm.joiningDate);
        employee.setSalary(employeeForm.salary);
        employee.setRol(employeeForm.rol);
        employee.setPerson(personService.findById(employeeForm.person));

        employeeService.save(employee);
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