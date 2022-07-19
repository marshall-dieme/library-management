package com.saraya.librarymgmt.mapper;

import com.saraya.librarymgmt.model.Genre;
import com.saraya.librarymgmt.dto.GenreDto;
import org.springframework.stereotype.Component;

@Component
public class GenreMapper {
    public GenreDto toDto(Genre genre){
        GenreDto dto = new GenreDto();
        dto.setId(genre.getId());
        dto.setName(genre.getName());
        return dto;
    }

    public Genre toEntity(GenreDto dto){
        Genre genre = new Genre();
        genre.setId(dto.getId());
        genre.setName(dto.getName());
        return genre;
    }
}
