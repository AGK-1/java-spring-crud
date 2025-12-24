package org.example.sprngtask2.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.example.sprngtask2.Dto.GenreDto;

import java.util.Set;

@Data
@Schema(description = "Movie response with all details")
public class MovieResponseDTO {

    @Schema(description = "Movie ID")
    private Long id;

    @Schema(description = "Movie title")
    private String title;

    @Schema(description = "Director name")
    private String director;

    @Schema(description = "Release year")
    private Integer year;

    @Schema(description = "Movie rating")
    private Double rating;

    @Schema(description = "Associated genres")
    private Set<GenreDto> genres;
}