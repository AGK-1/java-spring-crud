package org.example.sprngtask2.controller;

import lombok.RequiredArgsConstructor;
import org.example.sprngtask2.Dto.MovieDto;
import org.example.sprngtask2.Dto.MovieRequest;
import org.example.sprngtask2.entity.Movie;
import org.example.sprngtask2.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/movies")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @PostMapping("add-movie")
    public void addMovie(@RequestBody Movie movie) {
        movieService.addNewMovie(movie);
    }

    @GetMapping("get-all-movies")
    public List<Movie> getAllMovies() {
        return movieService.findAll();
    }

    @GetMapping("id/{id}")
    public Optional<Movie> getMovie(@PathVariable Long id) {
        return movieService.findTicketById(id);
    }

    @DeleteMapping("id/{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovies(id);
    }

    @PutMapping("id/{id}")
    public void updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        movieService.updateMovie(id, movie);
    }
}
