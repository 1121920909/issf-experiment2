package com.zyp.issf.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao extends HibernateDaoSupport {
    @Autowired
    @Qualifier("sessionFactory")
    public void setSessionFactoryBase(SessionFactory sessionFactory){
        this.setSessionFactory(sessionFactory);
    }
}
