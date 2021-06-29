package com.example.todo.model;

import javax.persistence.*;

@Entity
public class Task {
    @Id
    public Integer id;
    public String title;
    public String details;
    @Temporal(value = TemporalType.DATE)
    public java.util.Date dueDate;
    public Boolean done;
}
