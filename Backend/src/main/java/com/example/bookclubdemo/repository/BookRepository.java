package com.example.bookclubdemo.repository;

import com.example.bookclubdemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>
{

}
