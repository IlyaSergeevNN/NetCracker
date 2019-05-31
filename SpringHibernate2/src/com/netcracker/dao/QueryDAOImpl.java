package com.netcracker.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository("queryDAO")
@Transactional

public class QueryDAOImpl extends BaseDAO implements QueryDAO {

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

    //Нижегородский район заменил на Автозавод
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

    //Изменил условия на название магазинов Сормовского или Нижегородского районов
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

    public void queryBookNamesAanPrice() {
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

    public void queryBuyerShop() {
        List<Object[]> listQuery;

        try{
            //language=SQL
            String sqlQuery = "SELECT id.buy, last_name.buyers, name.shop FROM book WHERE name LIKE '%Windows%' OR price > 20";
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
}
