package com.thedreamt.thedreamtapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Journal {

    @Id
    @GeneratedValue
    private Long id;
    private String title;

    public Long getId() { return id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }
}
