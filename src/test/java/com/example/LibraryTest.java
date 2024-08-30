package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LibraryTest {
    
    public LibraryTest library ;


    public void initBooks(){
        library = new LibraryTest();
        library.addBook(new Book("1A", "Introduction to JAVA", "James Gosling", 1995));
        library.addBook(new Book("1B", "Introduction to Python", "Van Rossum", 1991));

    }
    @Test
    public void addBookTest(){
        library.addBook(new Book("1C", "Introduction to C++", "Bjarne Stroustrup", 1979));
        assertEquals(3, library.viewBooks().size());
    }
}
