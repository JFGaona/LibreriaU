package com.libreria.controller;

import com.libreria.model.Author;
import com.libreria.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable int id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable int id) {
        authorService.deleteAuthor(id);
    }
}
