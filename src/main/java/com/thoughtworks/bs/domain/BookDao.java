package com.thoughtworks.bs.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjli on 9/3/14.
 */

public class BookDao {

    static final String SELECT_ALL_BOOK = "select * from book";
    static final String INSERT_BOOK = "insert into book (isbn,title,author,price,location) values (?,?,?,?,?)";
    static final String UPDATE_BOOK = "update book set isbn = ?, title = ?, author = ?, price = ?, location = ?";
    static final String DELETE_BOOK =  "delete from book where isbn = ";
    static final String GET_BOOK = "select * from book where title like ";


    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired
    public JdbcTemplate jdbcTemplate;


    public List<Book> getAllBooks() {
        return jdbcTemplate.query(SELECT_ALL_BOOK, new BookRowMapper());
    }

    public void add(Book book) {
        jdbcTemplate.update(INSERT_BOOK,new Object[]{book.getIsbn(),book.getTitle(),book.getAuthor(),book.getPrice(),book.getLocation()});
    }

    public void removeBookByISBN(String isbn) {
        String sql = DELETE_BOOK + "\'"+isbn + "\'";
        jdbcTemplate.update(sql);
    }

    public List<Book> getBooksByTitle(String title) {
        List<Book> books = new ArrayList<Book>();
        String sql = GET_BOOK + "\'%" + title + "%\'";
        books = jdbcTemplate.query(sql, new BookRowMapper());
        return books;
    }
}





















