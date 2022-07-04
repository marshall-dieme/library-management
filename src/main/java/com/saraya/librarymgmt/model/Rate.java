package com.saraya.librarymgmt.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Rate extends BaseModel {

    private double rate;

    @Column(columnDefinition = "text")
    private String comment;

    @Column(columnDefinition = "datetime")
    private LocalDateTime rateDate;

    @ManyToOne
    private Book book;

    @ManyToOne
    private User user;


    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
