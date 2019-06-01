package com.netcracker.service;

import com.netcracker.dao.QueryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("queryService")
public class QueryServiceImpl implements QueryService {

    @Autowired
    private QueryDAO queryDAO;

    public void queryBooks() {
        queryDAO.queryBooks();
    }

    public void queryDistricts() {
        queryDAO.queryDistricts();
    }

    public void queryMonth() {

    }

    public void queryBuyers() {
        queryDAO.queryBuyers();
    }

    public void queryShops() {
        queryDAO.queryShops();
    }

    public void queryBookNamesAndPrice(){
        queryDAO.queryBookNamesAndPrice();
    }

    public void queryBuyerShop() {
        queryDAO.queryBuyerShop();
    }

    public void queryBuy() {
        queryDAO.queryBuy();
    }

    public void querySum60() {
        queryDAO.querySum60();
    }

}
