package com.netcracker.dao;

import com.netcracker.model.Buy;

import java.util.List;

public interface BuyDAO {

    void saveBuy(Buy buy);

    List<Buy> findAllBuys();

    Buy findBuyById (int id);

    void deleteBuyById (int id);

    void query1();

}
