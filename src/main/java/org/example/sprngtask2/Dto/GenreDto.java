package org.example.sprngtask2.Dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class GenreDto {
    @Schema(description = "Genre ID")
    private Long id;

    @Schema(description = "Genre name")
    private String name;
}
