package com.zyp.issf.service;


import com.zyp.issf.dao.BaseDao;
import com.zyp.issf.domain.College;
import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CollegeService {
    @Autowired
    private BaseDao dao;

    public List<College> findCollege() {
        HibernateTemplate template = dao.getHibernateTemplate();
        System.out.println(template);
        return template.findByExample(new College());
    }

}
