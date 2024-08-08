package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private BookRepository anotherBookRepository;

    // Constructor injection
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Setter method for dependency injection
    @Autowired
    public void setAnotherBookRepository(BookRepository anotherBookRepository) {
        this.anotherBookRepository = anotherBookRepository;
    }

    public void listBooks() {
        System.out.println("Listing books...");
        // Use bookRepository
        bookRepository.findAll();
        // Optionally use anotherBookRepository
        if (anotherBookRepository != null) {
            anotherBookRepository.findAll();
        }
    }
}
