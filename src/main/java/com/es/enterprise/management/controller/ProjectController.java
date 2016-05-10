package com.es.enterprise.management.controller;

import com.es.enterprise.management.form.ProjectForm;
import com.es.enterprise.management.service.EmployeeService;
import com.es.enterprise.management.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fjmora on 19/04/16.
 */
@Controller
@RequestMapping(value = {"","/project"})
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = {"/project","index"})
    public String index(Model model) {
        model.addAttribute("projects", projectService.findAll());
        return "project/index";
    }


    @RequestMapping(value = "create")
    public String create(Model model){

        model.addAttribute("employeeList",employeeService.findAll());
        model.addAttribute("projectForm",new ProjectForm());

        return "project/create";
    }
}
