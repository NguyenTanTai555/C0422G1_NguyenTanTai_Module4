package com.codegym.librarian.service;

import com.codegym.librarian.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService {
    Page<Book> findAll(String nameBook, Pageable pageable);

    Book findById(Integer id);

    void borrowBook(Integer id);

    void backBook(Integer id);

}
