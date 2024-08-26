package com.libreria.controller;

import com.libreria.model.Genre;
import com.libreria.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genres")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping
    public List<Genre> getAllGenres() {
        return genreService.getAllGenres();
    }

    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable int id) {
        return genreService.getGenreById(id);
    }

    @PostMapping
    public Genre createGenre(@RequestBody Genre genre) {
        return genreService.saveGenre(genre);
    }

    @DeleteMapping("/{id}")
    public void deleteGenre(@PathVariable int id) {
        genreService.deleteGenre(id);
    }
}
