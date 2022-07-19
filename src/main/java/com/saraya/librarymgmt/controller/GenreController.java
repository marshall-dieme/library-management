package com.saraya.librarymgmt.controller;

import com.saraya.librarymgmt.model.Genre;
import com.saraya.librarymgmt.dto.GenreDto;
import com.saraya.librarymgmt.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    private GenreService service;

    @GetMapping
    public ResponseEntity<List<Genre>> getGenres(){
        return ResponseEntity.ok(service.getGenres());
    }

    @PostMapping
    public ResponseEntity<GenreDto> create(@RequestBody GenreDto genre){
        return new ResponseEntity<>(service.createGenre(genre),
                HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<GenreDto> getGenre(@PathVariable("id") long id) {
        return ResponseEntity.ok(service.getGenre(id));
    }

    @PutMapping
    //@RequestMapping(value = "",method = RequestMethod.PUT)
    public Genre editGenre(@RequestBody Genre genre){
        return service.updateGenre(genre);
    }

    @DeleteMapping("/{id}")
    //@RequestMapping(value = "/{id}", ,method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") long id){
        service.deleteGenre(id);
    }
}
