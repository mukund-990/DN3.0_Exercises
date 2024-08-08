package com.library.api.repository;

import com.library.api.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

//extending the class JpaRepository provides all the CRUD functionality
public interface BookRepository extends JpaRepository<Book,Integer> {
}
