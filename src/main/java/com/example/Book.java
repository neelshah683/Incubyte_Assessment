package com.example;

public class Book {
    
    private String isbn, title, author;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String isbn, String title, String author, int pubYear){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = pubYear;
    }

    public String fetchIsbn(){
        return isbn;
    }

    public String fetchTitle(){
        return title;
    }

    public String fetchAuthor(){
        return author;
    }

    public int fetchPublicationYear(){
        return publicationYear;
    }

    public boolean chkAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean avail){
        isAvailable = avail;
    }
}
