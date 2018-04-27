package com.zyp.issf.dao;

import com.zyp.issf.domain.Student;

import java.util.List;

public interface StudentDao {
    Student findStudent(int id);

    List<Student> findAllStudent();

    int updateStudent(Student student);

    int insertStudent(Student student);
}
