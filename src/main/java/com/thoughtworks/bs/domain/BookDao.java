package com.thoughtworks.bs.domain;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hjli on 9/3/14.
 */
@Component
public class BookDao {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public void add(Book book) {
        sessionFactory.getCurrentSession().save(book);
    }

    @Transactional
    public List<Book> getAllBooks() {
        String sql = "select * from book";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        return query.list();
    }

    @Transactional
    public void removeBookByISBN(String ISBN) {
        String sql = "delete from book where isbn = ?";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        query.setString(0, ISBN);
        query.executeUpdate();
    }

    @Transactional
    public List<Book> getBooksByTitle(String title){
        String sql = "select * from book where title like ?";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        query.setString(0, "%"+title+"%");
        return query.list();
    }
}





















