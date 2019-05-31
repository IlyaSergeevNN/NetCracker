package com.netcracker.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "shop")
@Data
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "district", nullable = false)
    private String district;

    @Column(name = "commission", nullable = false)
    private int commission;

    public Shop(){

    }

    public Shop(String name, String district, int commission) {
        this.name = name;
        this.district = district;
        this.commission = commission;
    }
}
