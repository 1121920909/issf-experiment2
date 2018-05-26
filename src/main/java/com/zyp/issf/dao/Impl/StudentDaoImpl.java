package com.zyp.issf.dao.Impl;

import com.zyp.issf.dao.StudentDao;
import com.zyp.issf.domain.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public Student findStudent(int id) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Student where id = :id", Student.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public List<Student> findAllStudent() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Student",Student.class)
                .list();
    }

    @Override
    public int updateStudent(Student student) {
        sessionFactory.getCurrentSession().update(student);
        return 1;
    }

    @Override
    public int insertStudent(Student student) {
        return (int)sessionFactory.getCurrentSession()
                .save(student);
    }

    @Override
    public int deleteStudent(Student student) {
        sessionFactory.getCurrentSession()
                .delete(student);
        return 1;
    }
}
