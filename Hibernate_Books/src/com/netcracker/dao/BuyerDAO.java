package com.netcracker.dao;

import com.netcracker.model.Buyer;

import java.util.List;

public interface BuyerDAO {

    void saveBuyer(Buyer buyer);

    List<Buyer> findAllBuyers();

    Buyer findBuyerById (int id);

    void deleteBuyerById (int id);

}
