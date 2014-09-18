package com.thoughtworks.bs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "isbn")
    public String getIsbn() {

        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    private String isbn;
    private String title;

    private String location;

    public Book(String isbn, String title, String author, String price, String location) {
        this.isbn = isbn;
        this.title = title;
        this.location = location;
        this.author = author;
        this.price = price;
    }
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Book() {

    }


    private String author;
    private String price;
}
