package com.libreria.controller;

import com.libreria.model.BookCategory;
import com.libreria.service.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book-categories")
public class BookCategoryController {

    @Autowired
    private BookCategoryService bookCategoryService;

    @GetMapping
    public List<BookCategory> getAllBookCategories() {
        return bookCategoryService.getAllBookCategories();
    }

    @GetMapping("/{id}")
    public BookCategory getBookCategoryById(@PathVariable int id) {
        return bookCategoryService.getBookCategoryById(id);
    }

    @PostMapping
    public BookCategory createBookCategory(@RequestBody BookCategory bookCategory) {
        return bookCategoryService.saveBookCategory(bookCategory);
    }

    @DeleteMapping("/{id}")
    public void deleteBookCategory(@PathVariable int id) {
        bookCategoryService.deleteBookCategory(id);
    }
}
