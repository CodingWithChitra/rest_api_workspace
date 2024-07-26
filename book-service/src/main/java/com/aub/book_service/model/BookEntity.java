package com.aub.book_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_BOOK")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, name = "TITILE")
    private String title;
    @Column(name="AUTHOR")
    private String author;
    @Column(name="ISBN")
    private String isbn;
    @Column(name="TOTAL_PAGE")
    private int totalPage;
    public BookEntity(){}

    public BookEntity( String title, String author, String isbn, int totalPage) {
        
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.totalPage = totalPage;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
    @Override
    public String toString() {
        return "BookEntity [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", totalPage="
                + totalPage + "]";
    }
    

}
