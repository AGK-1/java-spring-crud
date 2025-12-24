package org.example.sprngtask2.repository;

import org.example.sprngtask2.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepsitory extends JpaRepository<Movie, Long> {
}
