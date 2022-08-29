package com.example.bookclubdemo.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
@Getter
@Setter
@ToString
public class Book
{

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String author;
    private String genre;
    private int numberOfPages;
    private String description;

    @OneToMany(mappedBy = "book")
    private List<Club> clubs;

    public Book() {
    }

    public Book(Long id, String title, String author, String genre, int numberOfPages, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.description = description;
    }
}
