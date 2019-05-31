package com.netcracker.dao;

import com.netcracker.model.Buy;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository("buyDAO")
@Transactional
public class BuyDAOImpl extends BaseDAO implements BuyDAO {

    public void saveBuy(Buy buy) {
        persist(buy);
    }

    public List<Buy> findAllBuys() {
        Criteria criteria = getSession().createCriteria(Buy.class);
        return criteria.list();
    }

    public Buy findBuyById(int id) {
        Criteria criteria = getSession().createCriteria(Buy.class);
        criteria.add(Restrictions.eq("id", id));
        return (Buy) criteria.uniqueResult();
    }

    public void deleteBuyById(int id) {
        Query query = getSession().createQuery("delete from Buy where id = :id");
        query.setInteger("id",id);
        query.executeUpdate();
    }

    public void query1(){
        Query query = getSession().createQuery("SELECT DISTINCT name, price FROM book");
        //query.setInteger("id",id);
        System.out.println(query.executeUpdate());
    }
}
