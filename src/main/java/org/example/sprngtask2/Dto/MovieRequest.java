package org.example.sprngtask2.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieRequest {
    private String title;
    private String director;
    private String year;
    private String rating;
    private List<Long> genreIds;

    // Getters and setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }

    public String getRating() { return rating; }
    public void setRating(String rating) { this.rating = rating; }

    public List<Long> getGenreIds() { return genreIds; }
    public void setGenreIds(List<Long> genreIds) { this.genreIds = genreIds; }
}
