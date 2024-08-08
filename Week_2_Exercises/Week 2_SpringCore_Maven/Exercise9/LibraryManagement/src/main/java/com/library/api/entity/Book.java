package com.library.api.entity;

import jakarta.persistence.*;

//used to define that in database table will be created of Book
@Entity
@Table(name="book")
public class Book {
    //created the member variables

    //primary key is bookid
    @Id
    //primary key value can be set or auto-generated
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookid;
    private String bookname;
    private String authorname;
    private double price;
    private String isbn;

    //Default Constructor
    public Book(){
        this.bookid=0;
        this.bookname=null;
        this.authorname=null;
        this.price=0;
        this.isbn=null;
    }

    //Parametrized Constructor

    public Book(String bookname, String authorname, double price, String isbn) {
        this.bookname = bookname;
        this.authorname = authorname;
        this.price = price;
        this.isbn = isbn;
    }

    //getter and setter

    public int getBookid() {
        return bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
