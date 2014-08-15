package com.thoughtworks.bs.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjli on 8/12/14.
 */
public class BookService {

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> bookList;

    public BookService() {
        bookList = new ArrayList<Book>();
        bookList.add(new Book("isbn_1","深入理解计算机系统","布莱恩特","72.5"));
        bookList.add(new Book("isbn_2","计算机科学导论","佛罗赞 莫沙拉夫","28.02"));
        bookList.add(new Book("isbn_3","计算机程序的构造和解释","艾伯森","31.00"));
        bookList.add(new Book("isbn_4","重构：改善既有代码的设计","Martin Fowler","43.8"));
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void removeBook(Book book){
        bookList.remove(book);
    }

    public List<Book> getBooksByTitle(String title){
        List<Book> result = new ArrayList<Book>();
        for(Book book : bookList){
            if(book.getTitle().contains(title)){
                result.add(book);
            }
        }
        return result;
    }


}
