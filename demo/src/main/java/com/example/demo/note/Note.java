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

    public String getText() {
        return text;
    }

    private LocalDate date = LocalDate.now();
    private String text;
    
    public void setText(String text) {
        this.text = text;
    }

    public Note() {
    }

    public Note(long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Note(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Note [id=" + id + ", date=" + date + ", text=" + text + "]";
    }

    
}
