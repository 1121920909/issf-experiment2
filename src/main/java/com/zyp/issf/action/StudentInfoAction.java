package com.zyp.issf.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zyp.issf.domain.College;
import com.zyp.issf.domain.Major;
import com.zyp.issf.domain.Student;
import com.zyp.issf.service.CollegeService;
import com.zyp.issf.service.MajorService;
import com.zyp.issf.service.StudentService;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.print.attribute.standard.NumberUp;
import java.util.List;

/**
 * @author ZYP
 */
@Controller
@Scope("prototype")
public class StudentInfoAction extends ActionSupport {


  private Student student;
  private List<Major> majorList;
  private List<College> collegeList;
  private List<Student> studentsList;
  @Autowired
  private CollegeService collegeService;
  @Autowired
  private MajorService majorService;
  @Autowired
  private StudentService studentService;

  public String index() {
    studentsList = studentService.findAllStudent();
    majorList = majorService.findMajor();
    collegeList = collegeService.findCollege();
    return SUCCESS;
  }

  public String insert() {
    studentService.insertStudent(student);
    return SUCCESS;
  }

  public String delete() {
    studentService.deleteStudent(student);
    return SUCCESS;
  }
  public List<Major> getMajorList() {
    return majorList;
  }

  public void setMajorList(List<Major> majorList) {
    this.majorList = majorList;
  }

  public List<College> getCollegeList() {
    return collegeList;
  }

  public void setCollegeList(List<College> collegeList) {
    this.collegeList = collegeList;
  }

  public List<Student> getStudentsList() {
    return studentsList;
  }

  public void setStudentsList(List<Student> studentsList) {
    this.studentsList = studentsList;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  @Override
  public String execute() throws Exception {
    return SUCCESS;
  }
}
