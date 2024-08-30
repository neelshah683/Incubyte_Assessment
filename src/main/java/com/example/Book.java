package com.example;
/*
 * Class representing the Books which contains details such as:
 * ISBN(UNIQUE) number, Book Title, Book Author, Book Publication Year
 * isAvailable - Availability Status
 */
public class Book {
    
    //Instance Variables
    private String isbn, title, author;
    private int publicationYear;
    private boolean isAvailable;

    //Constructor 
    public Book(String isbn, String title, String author, int pubYear){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = pubYear;
        this.isAvailable = true;
    }

    //get or fetch Isbn of a particular book
    public String fetchIsbn(){
        return isbn;
    }

    //get or fetch Title of a particular book
    public String fetchTitle(){
        return title;
    }

    //get or fetch Author of a particular book
    public String fetchAuthor(){
        return author;
    }

    //get or fetch Publication Year of a particular book
    public int fetchPublicationYear(){
        return publicationYear;
    }

    //check Availability status of a particular book
    public boolean chkAvailable(){
        return isAvailable;
    }

    //set Availability status of a particular book
    public void setAvailable(boolean avail){
        isAvailable = avail;
    }
}
