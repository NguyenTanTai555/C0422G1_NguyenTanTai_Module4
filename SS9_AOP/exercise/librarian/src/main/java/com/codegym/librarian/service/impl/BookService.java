package com.codegym.librarian.service.impl;

import com.codegym.librarian.model.Book;
import com.codegym.librarian.repository.IBookRepository;
import com.codegym.librarian.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public Page<Book> findAll(String nameBook, Pageable pageable) {
        return iBookRepository.findAllByBookNameContaining(nameBook,pageable);
    }

    @Override
    public Book findById(Integer id) {
        return this.iBookRepository.findById(id).orElse(null);
    }

    @Override
    public void borrowBook(Integer id) {
        iBookRepository.borrowBook(id);
    }

    @Override
    public void backBook(Integer id) {
        iBookRepository.backBook(id);
    }
}
