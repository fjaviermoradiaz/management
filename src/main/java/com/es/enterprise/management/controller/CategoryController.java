package com.es.enterprise.management.controller;

import com.es.enterprise.management.domain.Category;
import com.es.enterprise.management.domain.Customer;
import com.es.enterprise.management.form.CategoryForm;
import com.es.enterprise.management.form.CustomerForm;
import com.es.enterprise.management.service.CategoryService;
import com.es.enterprise.management.service.CustomerService;
import com.es.enterprise.management.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"","/category"})
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = {"/category","index"})
    public String index(Model model){
        model.addAttribute("categoryList", categoryService.findAll());
        return "category/index";
    }

    @RequestMapping(value = {"/category","create"})
    public String create(Model model){
        model.addAttribute("categoryForm",new CategoryForm());

        return "category/create";
    }

    @RequestMapping(value = {"/category","save"}, method = RequestMethod.POST)
    public String save(CategoryForm categoryForm){
        Category category = new Category();
        category.setName(categoryForm.name);
        category.setDescription(categoryForm.description);
        category.setActive(categoryForm.active);

        categoryService.save(category);
        return "redirect:category/index";
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