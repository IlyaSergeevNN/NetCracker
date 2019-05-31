package com.netcracker.service;

import com.netcracker.model.Buyer;

import java.util.List;

public interface BuyersService {

    void saveBuyer(Buyer buyer);

    List<Buyer> findAllBuyers();

    Buyer findBuyerById(int id);

    void deleteBuyerById(int id);
}
