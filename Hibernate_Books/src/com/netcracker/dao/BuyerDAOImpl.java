package com.netcracker.dao;


import com.netcracker.model.Buyer;
import com.netcracker.model.Contact;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("buyerDAO")
@Transactional
public class BuyerDAOImpl extends BaseDAO implements BuyerDAO {

    public void saveBuyer(Buyer buyer) {
        persist(buyer);
    }

    public List<Buyer> findAllBuyers() {
        Criteria criteria = getSession().createCriteria(Buyer.class);
        return criteria.list();
    }

    public Buyer findBuyerById(int id) {
        return null;
    }

    public void deleteBuyerById(int id) {
        Query query = getSession().createQuery("delete from Buyer where id = :id");
        query.setInteger("id",id);
        query.executeUpdate();
    }


}
