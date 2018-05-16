package com.zyp.issf.service;

import com.zyp.issf.dao.BaseDao;
import com.zyp.issf.dao.MajorDao;
import com.zyp.issf.domain.Major;
import org.hibernate.sql.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MajorService {
   @Autowired
    private MajorDao majorDao;

    public List<Major> findMajor() {
        return  majorDao.findAllMajor();
    }
}
