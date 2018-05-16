package com.zyp.issf.service;

import com.zyp.issf.dao.BaseDao;
import com.zyp.issf.dao.StudentDao;
import com.zyp.issf.domain.Student;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> findAllStudent() {
        return studentDao.findAllStudent();
    }

    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }

    public Student findStudent(int id) {
        return studentDao.findStudent(id);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public void deleteStudent(Student student) {
        studentDao.deleteStudent(student);
    }
}
