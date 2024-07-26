package com.aub.book_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aub.book_service.model.BookEntity;
import com.aub.book_service.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired BookService bookService;
    @GetMapping("/dummy")
    public ResponseEntity<List<BookEntity>> dummy(){
        return ResponseEntity.ok(bookService.dummyData());
    }
    @GetMapping("/listBook")
    public ResponseEntity<Page<BookEntity>> listBooks(
        @RequestParam(name = "pageNumber", defaultValue = "0") int pageNumber,
        @RequestParam(name = "pageSize", defaultValue = "10") int pageSize
    )
    {
        return ResponseEntity.ok(bookService.listBooks(pageNumber, pageSize));
    
    }

}
