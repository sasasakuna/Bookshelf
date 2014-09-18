package com.thoughtworks.bs.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Autowired
    public BookDao bookDao;

    public BookService() {
    }

    public void add(Book book){
        bookDao.add(book);
    }

    public void removeBookByISBN(String ISBN){
        bookDao.removeBookByISBN(ISBN);
    }

    public List<Book> getBooksByTitle(String title){
        return bookDao.getBooksByTitle(title);
    }


}
