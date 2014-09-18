package com.thoughtworks.bs.domain;

import org.junit.Before;
import org.junit.Test;


public class BookDaoTest {
    private BookDao bookDao;
//    private JdbcTemplate jdbcTemplate;
    @Before
    public void setUp() throws Exception {
        bookDao = new BookDao();
//        jdbcTemplate = Mockito.mock(JdbcTemplate.class);
//        bookDao.setJdbcTemplate(jdbcTemplate);
    }

    @Test
    public void shouldGetAllBooks() {
//        List<Book> value = new ArrayList<Book>();
//        value.add(new Book("isbn_5","Thinking in Java (4th Edition)","Bruce Eckel","$44.47","2排2行4列"));
//        Mockito.when(jdbcTemplate.query(Mockito.eq(bookDao.SELECT_ALL_BOOK), Mockito.any(BookRowMapper.class))).thenReturn(value);
//
//        List<Book> books = bookDao.getAllBooks();
//        verify(jdbcTemplate,times(1)).query(Mockito.eq(bookDao.SELECT_ALL_BOOK), Mockito.any(BookRowMapper.class));
//        assertThat(books.size(), is(1));
//        BookDao bookDao = new BookDao();
//        List<Book> bookList = bookDao.getAllBooks();
//        System.out.println(bookList);
    }

    @Test
    public void shouldAddBook() throws Exception{
//        Book book = new Book("isbn_5","Thinking in Java (4th Edition)","Bruce Eckel","$44.47","2排2行4列");
//        bookDao.add(book);
//        verify(jdbcTemplate,times(1)).update(Mockito.eq(bookDao.INSERT_BOOK), Mockito.eq("isbn_5"),
//                Mockito.eq("Thinking in Java (4th Edition)"), Mockito.eq("Bruce Eckel"),
//                Mockito.eq("$44.47"),Mockito.eq("2排2行4列"));
    }

    @Test
    public void shouldRemoveBookByISBN() throws Exception{
//        String sql = bookDao.DELETE_BOOK + "\'"+"isbn_5" + "\'";
//        bookDao.removeBookByISBN("isbn_5");
//        verify(jdbcTemplate,times(1)).update(Mockito.eq(sql));
    }

    @Test
      public void shouldGetBookByTitle(){
//          bookDao.getBooksByTitle("Java");
//          String sql = bookDao.GET_BOOK + "\'%" + "Java" + "%\'";
//          verify(jdbcTemplate,times(1)).query(Mockito.eq(sql), Mockito.any(BookRowMapper.class));
      }

}
