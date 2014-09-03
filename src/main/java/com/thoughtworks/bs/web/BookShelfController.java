package com.thoughtworks.bs.web;

import com.google.gson.Gson;
import com.thoughtworks.bs.domain.Book;
import com.thoughtworks.bs.domain.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    @ResponseBody
    public String getBook(@RequestParam("searchTitle") String searchTitle){
        System.out.println(searchTitle);
        Gson gson = new Gson();
        List<Book> bookList = bookService.getBooksByTitle(searchTitle);
        for(Book book : bookList){
            System.out.println(book.getTitle());
        }

        String json = gson.toJson(bookService.getBooksByTitle(searchTitle));
        return json;
    }




    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){

        return "login";
    }
}
