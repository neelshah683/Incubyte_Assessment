package com.example;

import java.util.*;

public class Library {
    
    private Map<String, Book> books;

    public Library(){
        this.books = new HashMap<>();
    }
    public void addBook(Book book){
        books.put(book.fetchIsbn(), book);
    }

    public Map<String, Book> viewBooks(){
        Map<String, Book> chkAvailBooks = new HashMap<>();
        for(Book book : books.values()){
            if(book.chkAvailable())
                chkAvailBooks.put(book.fetchIsbn(), book);
        }
        return chkAvailBooks;
    }
}
