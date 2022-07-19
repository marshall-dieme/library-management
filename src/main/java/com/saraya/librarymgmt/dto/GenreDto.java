package com.saraya.librarymgmt.dto;

import java.util.List;

public class GenreDto extends BaseDto {
    private String name;

    private List<BookDto> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookDto> getBooks() {
        return books;
    }

    public void setBooks(List<BookDto> books) {
        this.books = books;
    }
}
