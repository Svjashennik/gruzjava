package com.example.gruzjava.repository;

import com.example.gruzjava.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
