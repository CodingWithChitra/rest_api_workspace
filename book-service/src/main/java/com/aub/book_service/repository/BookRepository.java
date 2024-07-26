package com.aub.book_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aub.book_service.model.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
