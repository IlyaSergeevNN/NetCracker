package com.netcracker.service;

import com.netcracker.model.Buy;
import com.netcracker.model.Contact;

import java.util.List;

public interface BuyService {

    void saveBuy(Buy buy);

    List<Buy> findAllBuys();

    Buy findCBuyById(int id);

    void deleteBuyById(int id);

    void query1();

}
