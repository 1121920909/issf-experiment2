package com.zyp.issf.dao.Impl;

import com.zyp.issf.dao.MajorDao;
import com.zyp.issf.domain.Major;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Repository
public class MajorDaoImpl implements MajorDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Major> findAllMajor() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Major",Major.class)
                .list();
    }
}
