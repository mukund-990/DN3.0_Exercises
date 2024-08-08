package com.library.api.controller;

import com.library.api.entity.Book;
import com.library.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//since we have to create rest controller
@RestController
//request mapping is used for URL
@RequestMapping("api/books")
public class BookController {
    // add the dependency
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/test")
    public String test(){
        return "Welcome to Book API";
    }

    //creating  route map for adding the new book
    @PostMapping("/add")
    //passing object of the book in the RequestBody
    public Book addBook(@RequestBody Book book){
        //if id=0 then create new record, if i>0 update the record
        return bookRepository.save(book);
    }

    @PutMapping("/edit")
    public Book updateBook(@RequestBody Book book)
    {
        return bookRepository.save(book);
    }
    @GetMapping("/list")
    public List<Book> getAllBooks()
    {
        List<Book> books=bookRepository.findAll();
        return books;
    }

}
