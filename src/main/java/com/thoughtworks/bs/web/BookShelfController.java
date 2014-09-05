package com.thoughtworks.bs.web;

import com.thoughtworks.bs.domain.Book;
import com.thoughtworks.bs.domain.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hjli on 8/12/14.
 */
@Controller
public class BookShelfController {


    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Autowired
    BookService bookService;

    public BookShelfController() {
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
       return "index";
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> result = bookService.getAllBooks();
        if(result.size() == 0){
            return new ResponseEntity<List<Book>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Book>>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/books/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity addBook(@RequestBody Book book){
        bookService.add(book);
        return new ResponseEntity(HttpStatus.CREATED);
    }

//    @RequestMapping(value = "/books/{isbn}", method = RequestMethod.DELETE)
//    @ResponseBody
//    public ResponseEntity removeBook(@PathVariable String isbn){
//        bookService.removeBookByISBN(isbn);
//        return new ResponseEntity(HttpStatus.OK);
//    }

    @RequestMapping(value = "/books/{title}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Book>> getBooksByTitle(@PathVariable("title") String title){
        System.out.println("getBooksByTitle");
        List<Book> result = bookService.getBooksByTitle(title);
        if(result.size() == 0){
            return new ResponseEntity<List<Book>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Book>>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
}
