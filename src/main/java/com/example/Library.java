package com.example;

import java.util.*;

/*
 * Class Library which performs Library Management System
 * Methods():- addBook(), borrowBook(), returnBook(), viewBooks()
*/
public class Library {

    //Unique Identification of Books using it's ISBN Number.
    //HashMap just takes O(1) TC AND O(1) SC
    private Map<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    //Method to add a book to the library
    public void addBook(Book book) {
        books.put(book.fetchIsbn(), book);
    }

    //Method to borrow a book from the library
    public void borrowBook(String isbn) {
        Book book = books.get(isbn);

        if (book == null || !book.chkAvailable())
            throw new IllegalArgumentException("Book is not available.");

        book.setAvailable(false);
    }

    //Method to return a book to the library
    public void returnBook(String isbn) {
        Book book = books.get(isbn);

        if (book == null || book.chkAvailable())
            throw new IllegalArgumentException("Book was not borrowed");

        book.setAvailable(true);
    }

    //Method to fetch or view all the available books
    public Map<String, Book> viewBooks() {
        Map<String, Book> chkAvailBook = new HashMap<>();

        for (Book book : books.values()) {
            if (book.chkAvailable()) //based on it's true status
                chkAvailBook.put(book.fetchIsbn(), book);
        }

        return chkAvailBook;
    }
}
