package com.es.enterprise.management.form;

import java.util.Date;

/**
 * Created by fjmora on 19/04/16.
 */
public class ProjectForm {

    public String name;

    public String description;

    public Date initialDate;

    public Date endDate;

    public Double budget;

    //public Project parent;

    //public String customer;

    public Long responsible;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Long getResponsible() {
        return responsible;
    }

    public void setResponsible(Long responsible) {
        this.responsible = responsible;
    }
}
