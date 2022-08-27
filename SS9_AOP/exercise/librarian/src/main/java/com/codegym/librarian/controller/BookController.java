package com.codegym.librarian.controller;

import com.codegym.librarian.model.Book;
import com.codegym.librarian.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping("")
    public String showList(@PageableDefault(size = 2) Pageable pageable,
                           Model model,
                           @RequestParam Optional<String> bookName) {
        String bookNameVal = bookName.orElse("");
        model.addAttribute("books", this.bookService.findAll(bookNameVal, pageable));
        model.addAttribute("bookNameVal", bookNameVal);
        return "/book/list";
    }

    @GetMapping("/view/{id}")
    public String bookView(@PathVariable Integer id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        return "/book/view";
    }

    @PostMapping("/borrow")
    public String borrowBook(@RequestParam Integer id,Model model) throws Exception{
        Book book = bookService.findById(id);
        if (book.getAmount() == 0){
            throw new Exception();
        } else {
            bookService.borrowBook(id);
            model.addAttribute("book",book);
            return "book/view";
        }
    }
    @GetMapping("/backBook")
    public String giveBackForm(){
        return "book/back";
    }

    @PostMapping("/back")
    public String giveBack(@RequestParam Integer id) throws Exception {
        Book book = bookService.findById(id);
        if (book.getAmount() == book.getAmount()){
            throw new Exception();
        }else {
            bookService.backBook(id);
            return "book/back";
        }
    }

    @ExceptionHandler(value = Exception.class)
    public String errors(){
        return "book/errors";
    }
}
