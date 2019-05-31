package com.netcracker.model;

import com.netcracker.dao.BaseDAO;
import org.hibernate.Query;

public class Queries extends BaseDAO {

    public void query1(){
        Query query = getSession().createQuery("SELECT DISTINCT name, price FROM book");
        //query.setInteger("id",id);
        System.out.println(query.executeUpdate());
    }


}
