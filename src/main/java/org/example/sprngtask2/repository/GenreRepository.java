package org.example.sprngtask2.repository;

import org.example.sprngtask2.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {
}
