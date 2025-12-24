package org.example.sprngtask2.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Set;

@Data
@Schema(description = "Request to create or update a movie")
public class MovieDto {
    @Schema(description = "Movie title", example = "Father", required = true)
    private String title;

    @Schema(description = "Director name", example = "Ahail", required = true)
    private String director;

    @Schema(description = "Release year", example = "2024", required = true)
    private String year;

    @Schema(description = "Movie rating", example = "9.9", required = true)
    private String rating;

    @Schema(description = "List of genre IDs", example = "[1, 2, 3]")
    private Set<Long> genreIds;
}
