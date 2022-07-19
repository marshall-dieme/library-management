package com.saraya.librarymgmt.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Book extends BaseModel{

    @Column(length = 100)
    private String title;

    @Column(columnDefinition = "text")
    private String synopsis;

    @Column(columnDefinition = "date")
    private LocalDate publicationDate;

    @ManyToOne
    private Genre genre;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Author author;

    @OneToMany
    private List<Rate> rates;

    @ManyToMany
    private List<Loan> loans;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
}
