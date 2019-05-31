package com.netcracker.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "buyers")
@Data

public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "district", nullable = false)
    private String district;

    @Column(name = "discount", nullable = false)
    private int discount;

    public Buyer(){

    }

    public Buyer(String lastName, String district, int discount) {
        this.lastName = lastName;
        this.district = district;
        this.discount = discount;
    }
}



