package com.zyp.issf.dao;

import com.zyp.issf.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
@Rollback
public class StudentDaoTest {
    @Autowired
    private StudentDao dao;

    @Test
    public void findStudentTest() {
        Student student = dao.findStudent(1);
        System.out.println(student);
    }

    @Test
    public void updateStudentTest() {
        Student student = dao.findStudent(1);
        System.out.println(student);
        student.setName("studd");
        dao.updateStudent(student);
        student = dao.findStudent(1);
        System.out.println(student);
    }

    @Test
    public void insertStudentTest() {
        Student student = dao.findStudent(2);
        student.setName("tttt");
        student.setId(0);
        dao.insertStudent(student);
    }
}
