package com.es.enterprise.management.domain;

import javax.persistence.*;

/**
 * Created by Javi on 7/7/16.
 */
@Entity
@Table(name = "ES_DATA_NOTE")
public class Note {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TEXT")
    private String text; // TODO: habrá que cambiarlo por un blob

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
