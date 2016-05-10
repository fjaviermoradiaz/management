package com.es.enterprise.management.controller;

import com.es.enterprise.management.domain.Person;
import com.es.enterprise.management.form.PersonForm;
import com.es.enterprise.management.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {"","/person"})
public class PersonController {

    @Autowired
    private PersonService personService;


    @RequestMapping(value = {"/person","index"})
    public String index(Model model){
        model.addAttribute("persons", personService.findAll());
        return "person/index";
    }

    @RequestMapping(value = "create")
    public ModelAndView create(){
        return new ModelAndView("person/create", "personForm", new PersonForm());
       // return "person/create";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(@ModelAttribute PersonForm personForm){
        Person person = new Person();
        person.setEmail(personForm.email);
        person.setName(personForm.name);
        person.setMobile(personForm.mobile);
        personService.save(person);
        return "redirect:index";
    }

    @RequestMapping(value = "edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        model.addAttribute("person",personService.findById(id));
        return "person/edit";
    }


    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(Person person){
        personService.save(person);
        return "redirect:index";
    }


    @RequestMapping(value = "/test")
    public String test(){
        return " hello world";
    }


}