package com.saraya.librarymgmt.controller;

import com.saraya.librarymgmt.model.Book;
import com.saraya.librarymgmt.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getBooks(){
        return service.getBooks();
    }

    @PostMapping
    public Book create(@RequestBody Book book){
        return service.createBook(book);
    }

    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable("id") long id) {
        return service.getBook(id);
    }

    @PutMapping
    //@RequestMapping(value = "",method = RequestMethod.PUT)
    public Book editBook(@RequestBody Book book){
        return service.updateBook(book);
    }

    @DeleteMapping("/{id}")
    //@RequestMapping(value = "/{id}", ,method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") long id){
        service.deleteBook(id);
    }
}
