package com.thoughtworks.bs.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService {

    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Autowired
    private BookDao bookDao;

    public BookService() {
//        bookList = new ArrayList<Book>();
//        bookList.add(new EBook("isbn_1","Java: A Beginner's Guide","Herbert Schildt","$24.10","/EBook/Computer/Java: A Beginner's Guide.pdf"));
//        bookList.add(new PaperBook("isbn_2","Head First Java, 2nd Edition","Kathy Sierra and Bert Bates","$20.10","2排2行2列"));
//        bookList.add(new EBook("isbn_3","Effective Java(2nd Edition)","Joshua Bloch","$39.25","/EBook/Computer/Effective Java(2nd Edition).pdf"));
//        bookList.add(new PaperBook("isbn_4","Java: The Complete Reference (Compelte Reference Series)","Herbert Schildt","$38.49","2排2行3列"));
    }

    public void add(Book book){
        bookDao.add(book);
    }

    public void removeBookByISBN(String ISBN){
//        boolean result = false;
//        for(Book book : bookList){
//            if(book.getIsbn().equals(ISBN)){
//                result = bookList.remove(book);
//                break;
//            }
//        }
//        return result;
        bookDao.removeBookByISBN(ISBN);
    }

    public List<Book> getBooksByTitle(String title){
//        List<Book> result = new ArrayList<Book>();
//        for(Book book : bookList){
//            Pattern pattern = Pattern.compile(title);
//            Matcher matcher = pattern.matcher(book.getTitle());
//            if(matcher.find()){
//                result.add(book);
//            }
//        }
//        return result;
        return bookDao.getBooksByTitle(title);
    }


}
