package com.saraya.librarymgmt.services;

import com.saraya.librarymgmt.model.Book;
import com.saraya.librarymgmt.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> getBooks(){
        return repository.findAll();
    }

    public Optional<Book> getBook(long id){
        return repository.findById(id);
    }

    public Book createBook(Book book){
        return repository.save(book);
    }

    public Book updateBook(Book book){
        return repository.save(book);
    }
    public void deleteBook(long id){
        repository.delete(getBook(id).get());
    }
}
