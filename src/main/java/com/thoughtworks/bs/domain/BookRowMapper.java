package com.thoughtworks.bs.domain;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by hjli on 9/3/14.
 */
public class BookRowMapper implements RowMapper<Book> {


    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setIsbn(rs.getString("isbn"));
        book.setAuthor(rs.getString("author"));
        book.setTitle(rs.getString("title"));
        book.setPrice(rs.getString("price"));
        book.setLocation(rs.getString("location"));
        return book;
    }
}
