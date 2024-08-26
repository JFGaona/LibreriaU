package com.libreria.service;

import com.libreria.model.BookCategory;
import com.libreria.repository.BookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCategoryService {

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    public List<BookCategory> getAllBookCategories() {
        return bookCategoryRepository.findAll();
    }

    public BookCategory getBookCategoryById(int id) {
        return bookCategoryRepository.findById(id).orElse(null);
    }

    public BookCategory saveBookCategory(BookCategory bookCategory) {
        return bookCategoryRepository.save(bookCategory);
    }

    public void deleteBookCategory(int id) {
        bookCategoryRepository.deleteById(id);
    }
}
