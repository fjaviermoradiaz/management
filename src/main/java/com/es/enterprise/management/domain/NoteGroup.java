package com.es.enterprise.management.domain;

import javax.persistence.*;

/**
 * Created by Javi on 7/7/16.
 */
@Entity
@Table(name = "ES_DATA_NOTEGROUP")
public class NoteGroup {

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
}
