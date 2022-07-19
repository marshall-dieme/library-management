package com.saraya.librarymgmt.mapper;

import com.saraya.librarymgmt.model.Author;
import com.saraya.librarymgmt.dto.AuthorDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AuthorMapper {
    public AuthorDto toDto(Author author){
        AuthorDto dto = new AuthorDto();
        dto.setId(author.getId());
        dto.setFirstName(author.getFirstName());
        dto.setLastName(author.getLastName());
        dto.setNickname(author.getNickname());
        dto.setBirthDate(author.getBirthDate().toString());
        dto.setEmail(author.getEmail());
        return dto;
    }

    public Author toEntity(AuthorDto dto){
        Author author = new Author();
        author.setId(dto.getId());
        author.setFirstName(dto.getFirstName());
        author.setLastName(dto.getLastName());
        author.setNickname(dto.getNickname());
        author.setBirthDate(LocalDate.parse(dto.getBirthDate()));
        author.setEmail(dto.getEmail());
        return author;
    }
}
