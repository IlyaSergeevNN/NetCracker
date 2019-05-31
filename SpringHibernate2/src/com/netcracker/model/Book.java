package com.netcracker.model;

import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "stock", nullable = false)
    private String stock;

    @Column(name = "count", nullable = false)
    private int count;


    public Book(){

    }

    public Book(String name, double price, String stock, int count) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.count = count;
    }

    public double getPrice() {
        return price;
    }
}
