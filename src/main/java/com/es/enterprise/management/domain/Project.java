package com.es.enterprise.management.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by fjmora on 19/04/16.
 */
@Entity
@Table(name="ES_DATA_PROJECT")
public class Project {

    @Override
    public String toString(){
        return this.name;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "INITIAL_DATE")
    private Date initialDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "BUDGET")
    private Double budget;

    @ManyToOne(fetch=FetchType.LAZY)
    private Project parentProject;

    //TODO: Crear clase CUSTOMER
    @Column(name = "CUSTOMER")
    private String customer;

    @ManyToOne(fetch=FetchType.LAZY)
    private Employee responsible;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Project getParentProject() {
        return parentProject;
    }

    public void setParentProject(Project parentProject) {
        this.parentProject = parentProject;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Employee getResponsible() {
        return responsible;
    }

    public void setResponsible(Employee responsible) {
        this.responsible = responsible;
    }
}
