package com.thoughtworks.bs.domain;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.times;

/**
 * Created by hjli on 8/15/14.
 */
public class BookServiceTest {

    BookService bookService;
    BookDao bookDao;
    @Before
    public void startUp(){
        bookService = new BookService();
        bookDao = Mockito.mock(BookDao.class);
        bookService.setBookDao(bookDao);
    }


    @Test
    public void should_add_Book(){
        bookService.add(new Book("isbn_5", "Thinking in Java (4th Edition)", "Bruce Eckel", "$44.47", "2排2行4列"));
        Mockito.verify(bookDao,times(1)).add(any(Book.class));
    }

    @Test
    public void should_remove_Book_Success_when_exist(){
        bookService.removeBookByISBN("isbn_5");
        Mockito.verify(bookDao, times(1)).removeBookByISBN(Mockito.anyString());
    }


    @Test
    public void should_get_Book_Success_when_exist(){
        List<Book> value = new ArrayList<Book>();
        value.add(new Book("isbn_5","Thinking in Java (4th Edition)","Bruce Eckel","$44.47","2排2行4列"));
        Mockito.when(bookDao.getBooksByTitle(eq("Java: A Beginner's Guide"))).thenReturn(value);
        List<Book> result = bookService.getBooksByTitle("Java: A Beginner's Guide");
        assertThat(result.size(),is(1));
    }

    @Test
    public void should_get_Book_Failure_when_not_exist(){
        List<Book> value = new ArrayList<Book>();
        value.add(new Book("isbn_5","Thinking in Java (4th Edition)","Bruce Eckel","$44.47","2排2行4列"));
        Mockito.when(bookDao.getBooksByTitle(eq("Java: A Beginner's Guide"))).thenReturn(value);
        List<Book> result = bookService.getBooksByTitle("Java");
        assertThat(result.size(),is(0));
    }

}
