package com.zyp.issf.service;

import com.zyp.issf.dao.BaseDao;
import com.zyp.issf.domain.Student;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class StudentService {

    private HibernateTemplate template;
    @Autowired
    @Qualifier("baseDao")
    public void setBaseDao(BaseDao baseDao) {
        template = baseDao.getHibernateTemplate();
    }

    public List<Student> findStudent() {
        return template.findByExample(new Student());
    }

    public void insertStudent(Student student) {
        template.save(student);
    }

}
