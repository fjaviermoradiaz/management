package com.es.enterprise.management.form;

import com.es.enterprise.management.domain.Person;

import java.util.Date;

/**
 * Created by fjmora on 11/04/16.
 */
public class EmployeeForm {

    public Long person;

    public Date joiningDate;

    public float salary;

    public String rol;

    public Long getPerson() {
        return person;
    }

    public void setPerson(Long person) {
        this.person = person;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
