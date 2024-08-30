package com.example;

import java.util.*;

public class Library {
    
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book){
        books.put(book.fetchIsbn(), book);
    }
}
