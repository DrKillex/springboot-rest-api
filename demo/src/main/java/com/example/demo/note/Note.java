package com.example.demo.note;

import java.time.LocalDate;

public class Note {
    private long id;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private LocalDate date;
    private String text;
    
    public Note(long id, LocalDate date, String text) {
        this.id = id;
        this.date = date;
        this.text = text;
    }

    public Note(LocalDate date, String text) {
        this.date = date;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Note [id=" + id + ", date=" + date + ", text=" + text + "]";
    }

    
}
