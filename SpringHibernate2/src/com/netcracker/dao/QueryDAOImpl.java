package com.netcracker.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository("queryDAO")
@Transactional

public class QueryDAOImpl extends BaseDAO implements QueryDAO {

    //2a
    public void queryBooks() {
        List<Object[]> listQuery;

        try{
            //language=SQL
            String sqlQuery = "SELECT DISTINCT name, price FROM book";
            Query query = getSession().createSQLQuery(sqlQuery);
            System.out.println(query.getQueryString());
            listQuery = query.list();
                for (Object[] s : listQuery) {
                    System.out.println("name of book " + s[0] + ", price - " + s[1]);
                    }
        }catch (NoResultException e){
            System.out.println(e);
        }
    }

    //2b
    public void queryDistricts() {
        List<String> listQuery;

        try{
            //language=SQL
            String sqlQuery = "SELECT DISTINCT district FROM buyers";
            Query query = getSession().createSQLQuery(sqlQuery);
            System.out.println(query.getQueryString());
            listQuery = query.list();
            for (String s : listQuery) {
                System.out.println(s);
            }
        }catch (NoResultException e){
            System.out.println(e);
        }
    }

    public void queryMonth() {

    }

    //3a, Нижегородский район заменил на Автозавод
    public void queryBuyers() {
        List<Object[]> listQuery;

        try{
            //language=SQL
            String sqlQuery = "SELECT last_name, discount FROM buyers WHERE district = 'Avtozavod'";
            Query query = getSession().createSQLQuery(sqlQuery);
            System.out.println(query.getQueryString());
            listQuery = query.list();
            for (Object[] s : listQuery) {
                System.out.println("last name of buyer " + s[0] + ", discount - " + s[1]);
            }
        }catch (NoResultException e){
            System.out.println(e);
        }
    }

    //3b, Изменил условия на название магазинов Сормовского или Нижегородского районов
    public void queryShops() {
        List<String> listQuery;

        try{
            //language=SQL
            String sqlQuery = "SELECT name FROM shop WHERE district = 'Sormovo' OR district ='Nizhegorodsky'";
            Query query = getSession().createSQLQuery(sqlQuery);
            System.out.println(query.getQueryString());
            listQuery = query.list();
            for (String s : listQuery) {
                System.out.println("Name of shop " + s);
            }
        }catch (NoResultException e){
            System.out.println(e);
        }

    }

    //3c
    public void queryBookNamesAndPrice() {
        List<Object[]> listQuery;

        try{
            //language=SQL
            String sqlQuery = "SELECT name, price FROM book WHERE name LIKE '%Windows%' OR price > 20";
            Query query = getSession().createSQLQuery(sqlQuery);
            System.out.println(query.getQueryString());
            listQuery = query.list();
            for (Object[] s : listQuery) {
                System.out.println("Name of book " + s[0] + ", price - " + s[1]);
            }
        }catch (NoResultException e){
            System.out.println(e);
        }

    }

    //4a
    public void queryBuyerShop() {
        List<Object[]> listQuery;

        try{
            //language=SQL
            String sqlQuery = "SELECT buy.id, buyers.last_name, shop.name " +
                    "FROM buy, buyers, shop WHERE buy.buyer_id = buyers.id AND buy.seller_id = shop.id";

            Query query = getSession().createSQLQuery(sqlQuery);
            System.out.println(query.getQueryString());
            listQuery = query.list();
            for (Object[] s : listQuery) {
                System.out.println("Buy ID = " + s[0] + ", Buyer name = " + s[1] + ", Shop name = " + s[2]);
            }
        }catch (NoResultException e){
            System.out.println(e);
        }

    }

    public void queryBuy() {

        List<Object[]> listQuery;
        //дату, фамилию покупателя, скидку, название и количество купленных книг.
        try{
            //language=SQL
            String sqlQuery = "SELECT buy.date, buyers.last_name, buyers.discount, book.name, buy.amount " +
                    "FROM buy, buyers, book WHERE buy.buyer_id = buyers.id AND buy.book_id = book.id";

            Query query = getSession().createSQLQuery(sqlQuery);
            System.out.println(query.getQueryString());
            listQuery = query.list();
            for (Object[] s : listQuery) {
                System.out.println("Buy date = " + s[0] + ", Buyer name = " + s[1]
                        + ", Buyers discount = " + s[2] + ", Book name = " + s[3] + ", Amount = " + s[4]);
            }
        }catch (NoResultException e){
            System.out.println(e);
        }

    }

    //5a
    //номер заказа, фамилию покупателя и дату для покупок,
    // в которых было продано книг на сумму не меньшую чем 60 руб.
    public void querySum60() {
        List<Object[]> listQuery;
        try{
            //language=SQL
            String sqlQuery = "SELECT buy.id, buyers.last_name, buy.date, buy.sum " +
                    "FROM buy, buyers WHERE buy.buyer_id = buyers.id AND buy.sum >= 60";

            Query query = getSession().createSQLQuery(sqlQuery);
            System.out.println(query.getQueryString());
            listQuery = query.list();
            for (Object[] s : listQuery) {
                System.out.println("Buy id = " + s[0] + ", Buyer name = " + s[1]
                        + ", Buy date = " + s[2] + ", Buy sum = " + s[3]);
            }
        }catch (NoResultException e){
            System.out.println(e);
        }
    }
}
