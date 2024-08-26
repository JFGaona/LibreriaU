package com.libreria.model;

import jakarta.persistence.*;

@Entity
@Table(name = "BookCategories")
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookCategoryID;

    @ManyToOne
    @JoinColumn(name = "BookID", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "CategoryID", nullable = false)
    private Category category;

    public int getBookCategoryID() {
        return bookCategoryID;
    }

    public void setBookCategoryID(int bookCategoryID) {
        this.bookCategoryID = bookCategoryID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
