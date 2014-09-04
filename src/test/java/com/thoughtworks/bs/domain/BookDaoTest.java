package com.thoughtworks.bs.domain;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class BookDaoTest {
    private BookDao bookDao;
    private JdbcTemplate jdbcTemplate;
    @Before
    public void setUp() throws Exception {
        bookDao = new BookDao();
        jdbcTemplate = Mockito.mock(JdbcTemplate.class);
        bookDao.setJdbcTemplate(jdbcTemplate);
    }

    @Test
    public void shouldGetAllBooks() {
        List<Book> value = new ArrayList<Book>();
        value.add(new Book("isbn_5","Thinking in Java (4th Edition)","Bruce Eckel","$44.47","2排2行4列"));
        Mockito.when(jdbcTemplate.query(Mockito.eq(bookDao.SELECT_ALL_BOOK), Mockito.any(BookRowMapper.class))).thenReturn(value);

        List<Book> books = bookDao.getAllBooks();
        verify(jdbcTemplate,times(1)).query(Mockito.eq(bookDao.SELECT_ALL_BOOK), Mockito.any(BookRowMapper.class));
        assertThat(books.size(), is(1));
//        List<Book> value = bookDao.getAllBooks();
//        System.out.println(value.size());
    }

    @Test
    public void shouldAddBook() throws Exception{
        Book book = new Book("isbn_5","Thinking in Java (4th Edition)","Bruce Eckel","$44.47","2排2行4列");
        bookDao.add(book);
        verify(jdbcTemplate,times(1)).update(Mockito.eq(bookDao.INSERT_BOOK), Mockito.eq("isbn_5"),
                Mockito.eq("Thinking in Java (4th Edition)"), Mockito.eq("Bruce Eckel"),
                Mockito.eq("$44.47"),Mockito.eq("2排2行4列"));
    }

    @Test
    public void shouldRemoveBookByISBN() throws Exception{
        String sql = bookDao.DELETE_BOOK + "isbn_5";
        bookDao.removeBookByISBN("isbn_5");
        verify(jdbcTemplate,times(1)).update(Mockito.eq(sql));
    }

    @Test
      public void shouldGetBookByTitle(){
          bookDao.getBooksByTitle("isbn_5");
          String sql = bookDao.GET_BOOK + "%" + "isbn_5" + "%";
          verify(jdbcTemplate,times(1)).query(Mockito.eq(sql), Mockito.any(BookRowMapper.class));
      }

//    @Test
//    public void shouldUpdate(){
//        Employee employee = new Employee(11111,"name1","2014-1");
//        bookDao.update(employee);
//        verify(jdbcTemplate,times(1)).update(Mockito.eq(EmployeeDao.UPDATE_EMPLOYEE), Mockito.eq(11111), Mockito.eq("name1"), Mockito.eq("2014-1"));
//    }
//
//    @Test
//    public void shouldAutoCompleteEmployeeNameId(){
//
//        bookDao.autoCompleteEmployeeNameId("aa");
//        String sql = "select * from EMPLOYEE where NAME like '%aa%'";
//        verify(jdbcTemplate,times(1)).query(Mockito.eq(sql), Mockito.any(EmployeeRowMapper.class));
//    }
//
//    @Test
//    public void shouldInsertTheUpdateEmployee(){
//        List<Employee> employees = new ArrayList<Employee>();
//        employees.add(new Employee(12345, "name", "2014-2"));
//        bookDao.saveEmployee(employees);
//        String sql = bookDao.GET_EMPLOYEE+12345;
//        verify(jdbcTemplate,times(1)).query(Mockito.eq(sql), Mockito.any(EmployeeRowMapper.class));
//       verify(jdbcTemplate,times(1)).update(Mockito.eq(EmployeeDao.INSERT_EMPLOYEE), Mockito.eq(12345), Mockito.eq("name"), Mockito.eq("2014-2"));
//    }
}
