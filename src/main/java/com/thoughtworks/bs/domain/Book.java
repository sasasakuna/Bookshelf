package com.thoughtworks.bs.domain;

/**
 * Created by hjli on 8/12/14.
 */
public class Book {

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

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
