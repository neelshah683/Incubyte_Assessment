package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.beans.Transient;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;

/*
 * Test Cases Generation Class
 * TDD: Test Driven Development
 * 1. FAIL TEST CASE
 * 2. WRITE ENOUGH CODE TO PASS IT
 * 3. REFACTOR CODE
 * 4. REPEAT
 */

public class LibraryTest {
    
    public Library library ;
    private Book book1, book2;


    //Resetting the state & Avoid code duplication
    //Each test case start with a fresh consistent state

    @BeforeEach
    public void init(){
        library = new Library();

        System.out.println("initial config:");

        book1 = new Book("1A", "Introduction to JAVA", "James Gosling", 1995);
        book2 = new Book("1B", "Introduction to Python", "Van Rossum", 1991);
        library.addBook(book1);
        library.addBook(book2);
    }

    //Adding Books Test Cases to library

    @Test
    public void addBookTest(){
        Book book3 = new Book("1C", "Introduction to C++", "Bjarne Stroustrup", 1979);
        library.addBook(book3);

        assertEquals(3, library.viewBooks().size());
    }

    //Adding Book Already Exist
    @Test
    public void addDuplicateBookTest() {
        Book duplicateBook = new Book("1A", "Another Java Book", "Author", 2020);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            library.addBook(duplicateBook); // Attempting to add a book with the same ISBN as book1
        });
        assertEquals("Book with this ISBN already exists", exception.getMessage());
    }

    //Borrowing Books Test Cases from library

    @Test
    public void borrowBookTest(){
        library.borrowBook("1A");
        assertFalse(library.viewBooks().containsKey("1A"));
    }

    //Borrowing Books Not Available Test Cases from library

    @Test
    public void borrowBookNotAvailableTest(){
        library.borrowBook("1A");
        assertThrows(IllegalArgumentException.class, () -> library.borrowBook("1A"));
    }

    //Returning Books Test Cases to library

    @Test
    public void returnBookTest(){
        library.borrowBook("1A");
        library.returnBook("1A");
        assertTrue(library.viewBooks().containsKey("1A"));
    }

    //Returning Books Not Borrowed Test Case from library

    @Test
    public void returnBookNotBorrowedTest(){
        assertThrows(IllegalArgumentException.class, () -> library.returnBook("1B"));
    }

    //Viewing All the Available Books Test Case from library

    @Test
    public void vewBooksTest(){
        Map<String, Book> availBooks = library.viewBooks();
        assertEquals(2, availBooks.size());
        assertTrue(availBooks.containsKey("1A"));
        assertTrue(availBooks.containsKey("1B"));

    }
}
