package com.codegym.librarian.repository;

import com.codegym.librarian.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Transactional
public interface IBookRepository extends JpaRepository<Book, Integer> {
    Page<Book> findAllByBookNameContaining(String nameBook, Pageable pageable);

    @Modifying
    @Query(value = "update book set book.amountRent = book.amountRent - 1 where bookId = :id", nativeQuery = true)
     void borrowBook(Integer id);

    @Modifying
    @Query(value = "update book set book.amountRent = book.amountRent + 1 where bookId = : id", nativeQuery = true)
    void backBook(Integer id);
}
