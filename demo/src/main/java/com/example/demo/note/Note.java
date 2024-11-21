package com.example.demo.note;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    
    public Note() {
    }

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
