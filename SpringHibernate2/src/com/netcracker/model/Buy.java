package com.netcracker.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data

@Entity
@Table(name = "buy")
public class Buy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "seller_id", nullable = false)
    private Shop shop;

    @ManyToOne
    @JoinColumn(name = "buyer_id", nullable = false)
    private Buyer buyer;

    @OneToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Column(name = "amount", nullable = false)
    private int amount;

    @Column(name = "sum", nullable = false)
    private double sum;

    public Buy(){

    }

    public Buy(Date date, Shop shop, Buyer buyer, Book book, int amount) {
        this.date = date;
        this.shop = shop;
        this.buyer = buyer;
        this.book = book;
        this.amount = amount;
        this.sum = book.getPrice() * amount;
    }
}
