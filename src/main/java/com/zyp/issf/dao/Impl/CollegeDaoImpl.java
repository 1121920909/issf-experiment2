package com.zyp.issf.dao.Impl;

import com.zyp.issf.dao.CollegeDao;
import com.zyp.issf.domain.College;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class CollegeDaoImpl implements CollegeDao {
    private SessionFactory sessionFactory;

    @Autowired
    @Qualifier("sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<College> findAllCollege() {
        return sessionFactory.getCurrentSession()
                .createQuery("from College",College.class)
                .list();
    }
}
