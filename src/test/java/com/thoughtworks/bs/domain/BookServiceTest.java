package com.thoughtworks.bs.domain;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by hjli on 8/15/14.
 */
public class BookServiceTest {

    BookService bookService;
    @Before
    public void startUp(){
        bookService = new BookService();
    }


    @Test
    public void should_add_Book(){
//        int total = bookService.getBookList().size();
//        bookService.addBook(new PaperBook("isbn_5","Thinking in Java (4th Edition)","Bruce Eckel","$44.47","2排2行4列"));
//        int newTotal = bookService.getBookList().size();
//        assertThat(newTotal,is(total+1));
    }

    @Test
    public void should_remove_Book_Success_when_exist(){
//        bookService.addBook(new PaperBook("isbn_5","Thinking in Java (4th Edition)","Bruce Eckel","$44.47","2排2行4列"));
//        boolean result = bookService.removeBookByISBN("isbn_5");
//        assertThat(result,is(true));

    }

    @Test
    public void should_remove_Book_Failure_when_not_exist(){
//        boolean result = bookService.removeBookByISBN("isbn_5");
//        assertThat(result,is(false));

    }

    @Test
    public void should_get_Book_Success_when_exist(){
//        List<Book> result = bookService.getBooksByTitle("Java: A Beginner's Guide");
//        assertThat(result.size(),is(1));

    }

    @Test
    public void should_get_Book_Failure_when_not_exist(){
//        List<Book> result = bookService.getBooksByTitle("HTML and CSS : Design and Build Webistes");
//        assertThat(result.size(),is(0));

    }


}
