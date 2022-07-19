package com.saraya.librarymgmt.services;

import com.saraya.librarymgmt.mapper.GenreMapper;
import com.saraya.librarymgmt.model.Genre;
import com.saraya.librarymgmt.dto.GenreDto;
import com.saraya.librarymgmt.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreService {

    @Autowired
    private GenreRepository repository;

    @Autowired
    private GenreMapper genreMapper;

    public List<Genre> getGenres(){
        return repository.findAll();
    }

    public GenreDto getGenre(long id){
        Optional<Genre> genre = repository.findById(id);
       return genreMapper.toDto(genre.get());
    }

    public GenreDto createGenre(GenreDto dto){
        Genre genre = genreMapper.toEntity(dto);
        genre =  repository.save(genre);
        return genreMapper.toDto(genre);
    }

    public Genre updateGenre(Genre genre){
        return repository.save(genre);
    }
    public void deleteGenre(long id){
        //repository.delete(getGenre(id).get());
    }


}
