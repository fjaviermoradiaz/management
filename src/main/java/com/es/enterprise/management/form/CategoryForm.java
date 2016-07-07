package com.es.enterprise.management.form;

import java.util.Date;

/**
 * Created by fjmora on 11/04/16.
 */
public class CategoryForm {

    public String name;

    public String description;


    public boolean active;

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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
