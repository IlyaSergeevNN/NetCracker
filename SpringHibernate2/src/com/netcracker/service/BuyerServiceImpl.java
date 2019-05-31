package com.netcracker.service;

import com.netcracker.dao.BuyerDAO;
import com.netcracker.model.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("buyersService")
public class BuyerServiceImpl implements BuyersService {

    @Autowired
    private BuyerDAO buyerDAO;


    public void saveBuyer(Buyer buyer) {
        buyerDAO.saveBuyer(buyer);
    }

    public List<Buyer> findAllBuyers() {
        return buyerDAO.findAllBuyers();
    }

    public Buyer findBuyerById(int id) {
        return null;
    }

    public void deleteBuyerById(int id) {
        buyerDAO.deleteBuyerById(id);
    }
}
