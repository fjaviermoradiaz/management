package com.es.enterprise.management.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="ES_DATA_EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //private Category category;
    //@Column(name="RESPONSIBLE")
    //private Employee responsible;

    @ManyToOne(fetch=FetchType.LAZY)
    private Person person;

    @Column(name="JOINING_DATE")
    private Date joiningDate;

    @Column(name="SALARY")
    private float salary;

    @Column(name="ROL")
    private String rol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


//	public Employee getResponsible() {
//		return responsible;
//	}
//
//	public void setResponsible(Employee responsible) {
//		this.responsible = responsible;
//	}

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
