package com.aub.book_service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.aub.book_service.model.BookEntity;
import com.aub.book_service.repository.BookRepository;

@Service("bookService")
public class BookService {
    @Autowired BookRepository bookRepository;

    public List<BookEntity> dummyData(){
        //Dynamic Binding
        List<BookEntity> books = new ArrayList<>();
        int i = 0;
        BookEntity b = null;
        while (i < 100) {
            b = new BookEntity("Java AUB Book", "AUB", "12345-4567-5678", 500);
            books.add(b);
            i++;
        }
       return bookRepository.saveAll(books);
    }
    public Page<BookEntity> listBooks(int pageNumber, int pageSize){
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return bookRepository.findAll(pageable);
    }

}
