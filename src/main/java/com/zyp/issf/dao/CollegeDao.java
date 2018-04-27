package com.zyp.issf.dao;

import com.zyp.issf.domain.College;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public interface CollegeDao  {
    List<College> findAllCollege();
}
