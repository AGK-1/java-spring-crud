package org.example.sprngtask2.controller;


import lombok.RequiredArgsConstructor;
import org.example.sprngtask2.entity.Genre;
import org.example.sprngtask2.entity.Movie;
import org.example.sprngtask2.service.GenreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/genre")
@RequiredArgsConstructor
public class GenreController {
    private final GenreService genreService;
    @PostMapping("add-genre")
    public void addMovie(@RequestBody Genre genre) {
        genreService.addNewGenre(genre);
    }

    @GetMapping("get-all-genre")
    public List<Genre> findAllGenre() {
        return genreService.findGenres();
    }

    @DeleteMapping("id/{id}")
    public void deleteMovie(@PathVariable int id) {
        genreService.deleteGenre(id);
    }
}
