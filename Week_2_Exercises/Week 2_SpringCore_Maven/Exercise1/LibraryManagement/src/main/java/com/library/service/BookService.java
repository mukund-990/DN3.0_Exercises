package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    //declaring the property called book repository
    public void performService() {
        System.out.println("Performing service...123");
    }
}
