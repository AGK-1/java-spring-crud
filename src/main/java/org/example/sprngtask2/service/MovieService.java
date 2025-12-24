package org.example.sprngtask2.service;


import lombok.RequiredArgsConstructor;
import org.example.sprngtask2.Dto.MovieDto;
import org.example.sprngtask2.Dto.MovieRequest;
import org.example.sprngtask2.entity.Genre;
import org.example.sprngtask2.entity.Movie;
import org.example.sprngtask2.repository.GenreRepository;
import org.example.sprngtask2.repository.MovieRepsitory;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepsitory movieRepsitory;
    private final GenreRepository genreRepository;


    public void addNewMovie(Movie movie) {
        movieRepsitory.save(movie);
    }


    public List<Movie> findAll() {
        return movieRepsitory.findAll();
    }

    public Optional<Movie> findTicketById(Long id) {
        return movieRepsitory.findById(id);
    }
    public void deleteMovies(Long id) {
        movieRepsitory.deleteById(id);
    }


    public void updateMovie(Long id, Movie movie) {
        Optional<Movie> movieUpdate = movieRepsitory.findById(id);
        if (movieUpdate.isPresent()) {
            Movie existingMovie = movieUpdate.get();
            existingMovie.setTitle(movie.getTitle());
            existingMovie.setDirector(movie.getDirector());
            existingMovie.setYear(movie.getYear());
            existingMovie.setRating(movie.getRating());
            movieRepsitory.save(existingMovie);
        }

    }


}
