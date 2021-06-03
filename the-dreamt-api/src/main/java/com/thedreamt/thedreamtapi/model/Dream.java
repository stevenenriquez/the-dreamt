package com.thedreamt.thedreamtapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dream {
    
    @Id
    @GeneratedValue
    private Long dreamId;
    private Long journalId;
    private String title;
    private String content;

    public Long getDreamId() { return dreamId; }

    public Long getJournalId() { return journalId; }

    public void setJournalId(Long journalId) { this.journalId = journalId; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }
}
