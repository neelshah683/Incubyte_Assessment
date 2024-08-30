package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;


public class LibraryTest {
    
    public Library library ;
    private Book book1, book2;

    @BeforeEach
    public void init(){
        library = new Library();
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
}
