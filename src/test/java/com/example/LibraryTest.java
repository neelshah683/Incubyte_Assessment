package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;


public class LibraryTest {
    
    public Library library ;
    private Book book1, book2;

    @BeforeEach
    public void init(){
        library = new Library();

        System.out.println("initial config:");

        book1 = new Book("1A", "Introduction to JAVA", "James Gosling", 1995);
        book2 = new Book("1B", "Introduction to Python", "Van Rossum", 1991);
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void addBookTest(){
        Book book3 = new Book("1C", "Introduction to C++", "Bjarne Stroustrup", 1979);
        library.addBook(book3);

        assertEquals(3, library.viewBooks().size());
    }

    @Test
    public void borrowBookTest(){
        library.borrowBook("1A");
        assertFalse(library.viewBooks().containsKey("1A"));
    }

    @Test
    public void borrowBookNotAvailableTest(){
        library.borrowBook("1A");
        assertThrows(IllegalArgumentException.class, () -> library.borrowBook("1A"));
    }

    @Test
    public void returnBookTest(){
        library.borrowBook("1A");
        library.returnBook("1A");
        assertTrue(library.viewBooks().containsKey("1A"));
    }

    @Test
    public void returnBookNotBorrowedTest(){
        assertThrows(IllegalArgumentException.class, () -> library.returnBook("1B"));
    }

    @Test
    public void vewBooksTest(){
        Map<String, Book> availBooks = library.viewBooks();
        assertEquals(2, availBooks.size());
        assertTrue(availBooks.containsKey("1A"));
        assertTrue(availBooks.containsKey("1B"));

    }
}
