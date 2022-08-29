package com.example.bookclubdemo.controller;

import com.example.bookclubdemo.model.Book;
import com.example.bookclubdemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController
{
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }

    @PostMapping("/book/create")
    public Book createBook(@RequestBody Book b)
    {
        return bookRepository.save(b);
    }
}
