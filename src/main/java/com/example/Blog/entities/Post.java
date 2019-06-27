package com.example.Blog.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

//    creating a unique id for this particular entity

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String body;
    private Date DateCreated;


    //constructor with no arguments
    public Post() {

    }

//    getter and setter for each of the entities

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        DateCreated = dateCreated;
    }
}
