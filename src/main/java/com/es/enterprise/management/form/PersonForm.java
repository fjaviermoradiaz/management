package com.es.enterprise.management.form;

import java.sql.Clob;

/**
 * Created by fjmora on 8/04/16.
 */
public class PersonForm {

    public String name;

    public String email;

    public String mobile;

    public Clob photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Clob getPhoto() {
        return photo;
    }

    public void setPhoto(Clob photo) {
        this.photo = photo;
    }
}
