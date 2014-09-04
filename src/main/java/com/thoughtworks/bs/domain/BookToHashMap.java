package com.thoughtworks.bs.domain;

import java.util.HashMap;

/**
 * Created by hjli on 9/4/14.
 */
public class BookToHashMap {

    public static HashMap<String,String> translate(Book book){
        HashMap<String, String> bookTranslate = new HashMap<>();
        bookTranslate.put("isbn",book.getIsbn());
        bookTranslate.put("title",book.getTitle());
        bookTranslate.put("author",book.getAuthor());
        bookTranslate.put("price",book.getPrice());
        bookTranslate.put("location",book.getLocation());
        return bookTranslate;
    }
}
