package com.saraya.librarymgmt.mapper;

import com.saraya.librarymgmt.model.Author;
import com.saraya.librarymgmt.model.Book;
import com.saraya.librarymgmt.model.Genre;
import com.saraya.librarymgmt.dto.BookDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class BookMapper {
    public BookDto toDto(Book book){
        BookDto dto = new BookDto();
        dto.setId(book.getId());
        dto.setAuthorId(book.getAuthor().getId());
        dto.setGenreId(book.getGenre().getId());
        dto.setSynopsis(book.getSynopsis());
        dto.setTitle(book.getTitle());
        dto.setPublicationDate(book.getPublicationDate().toString());
        return dto;
    }

    public Book toEntity(BookDto dto) {
        Book book = new Book();
        Author author = new Author();
        Genre genre = new Genre();
        //---------------------------
        author.setId(dto.getAuthorId());
        genre.setId(dto.getGenreId());
        //---------------------------
        book.setId(dto.getId());
        book.setAuthor(author);
        book.setGenre(genre);
        book.setPublicationDate(LocalDate.parse(dto.getPublicationDate()));
        book.setSynopsis(dto.getSynopsis());
        book.setTitle(dto.getTitle());
        return book;
    }
}
