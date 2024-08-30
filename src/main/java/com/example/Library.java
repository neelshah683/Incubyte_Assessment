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

    public void borrowBook(String isbn){
        Book book = books.get(isbn);
        if(book == null || !book.chkAvailable())
            throw new IllegalArgumentException("Book is not available.");
        book.setAvailable(false);
    }

    public void returnBook(String isbn){
        Book book = books.get(isbn);
        if(book == null || book.chkAvailable())
            throw new IllegalArgumentException("Book was not borrowed");
        book.setAvailable(true);
    }
    public Map<String, Book> viewBooks(){
        Map<String, Book> chkAvailBook = new HashMap<>();
        for(Book book : books.values()){
            if(book.chkAvailable())
                chkAvailBook.put(book.fetchIsbn(), book);
        }
        return chkAvailBook;
    }
}
