package com.zyp.issf.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zyp.issf.domain.College;
import com.zyp.issf.domain.Major;
import com.zyp.issf.domain.Student;
import com.zyp.issf.service.CollegeService;
import com.zyp.issf.service.MajorService;
import com.zyp.issf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author ZYP
 */
@Controller
@Scope("prototype")
public class StudentInfoAction extends ActionSupport {


  private Student student;
  private int id;
  private String name;
  private String age;
  private String sex;
  private Major major;
  private College college;
  private String hobby;
  private List<Major> majorList;
  private List<College> collegeList;
  private List<Student> studentsList;
  @Autowired
  private CollegeService collegeService;
  @Autowired
  private MajorService majorService;
  @Autowired
  private StudentService studentService;
  public String index() throws Exception {
    System.out.println("index");
    studentsList = studentService.findAllStudent();
    majorList = majorService.findMajor();
    collegeList = collegeService.findCollege();
    return SUCCESS;
  }

  public String insert() throws Exception {
    studentService.insertStudent(student);
    return SUCCESS;
  }

  public String update() throws Exception {
    studentService.updateStudent(student);
    return SUCCESS;
  }

  public String delete() throws Exception {
    studentService.deleteStudent(student);
    return SUCCESS;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Major getMajor() {
    return major;
  }

  public void setMajor(Major major) {
    this.major = major;
  }

  public College getCollege() {
    return college;
  }

  public void setCollege(College college) {
    this.college = college;
  }

  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
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
