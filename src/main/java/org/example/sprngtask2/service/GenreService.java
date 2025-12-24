package org.example.sprngtask2.service;

import lombok.RequiredArgsConstructor;
import org.example.sprngtask2.entity.Genre;
import org.example.sprngtask2.entity.Movie;
import org.example.sprngtask2.repository.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreService {

    private final GenreRepository genreRepository;

    public void addNewGenre(Genre genre) {
        genreRepository.save(genre);
    }

    public List<Genre> findGenres() {
        return genreRepository.findAll();
    }
    public void deleteGenre(int id) {
        genreRepository.deleteById((long) id);
    }
}
