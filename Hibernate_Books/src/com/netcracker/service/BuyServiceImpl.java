package com.netcracker.service;

import com.netcracker.dao.BuyDAO;
import com.netcracker.model.Buy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("buyService")
public class BuyServiceImpl implements BuyService {

    @Autowired
    private BuyDAO buyDAO;

    public void saveBuy(Buy buy) {
        buyDAO.saveBuy(buy);
    }

    public List<Buy> findAllBuys() {
        return buyDAO.findAllBuys();
    }

    public Buy findCBuyById(int id) {
        return buyDAO.findBuyById(id);
    }

    public void deleteBuyById(int id) {
        buyDAO.deleteBuyById(id);
    }

    public void query1() {
        buyDAO.query1();
    }


}
