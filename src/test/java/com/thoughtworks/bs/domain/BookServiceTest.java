package com.thoughtworks.bs.domain;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

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
//        List<Book> books = new ArrayList<Book>();
//        books.add(new Book("isbn_5", "Thinking in Java (4th Edition)", "Bruce Eckel", "$44.47", "2排2行4列"));
//        Mockito.when(bookDao.getAllBooks()).thenReturn(books);
//        int total = bookService.getAllBooks().size();

        bookService.add(new Book("isbn_5", "Thinking in Java (4th Edition)", "Bruce Eckel", "$44.47", "2排2行4列"));
//        int newTotal = bookService.getAllBooks().size();
//        assertThat(newTotal,is(total+1));
        Mockito.verify(bookDao,times(1)).add(Mockito.any(Book.class));
    }

    @Test
    public void should_remove_Book_Success_when_exist(){
        bookService.removeBookByISBN("isbn_5");
//        boolean result = bookService.removeBookByISBN("isbn_5");
//        assertThat(result,is(true));
        Mockito.verify(bookDao, times(1)).removeBookByISBN(Mockito.anyString());
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
