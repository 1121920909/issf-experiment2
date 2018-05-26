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

import java.util.ArrayList;
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
  private String major;
  private String college;
  private String hobby;
  private List<String> majorList;
  private List<String> collegeList;
  private List<Student> studentsList;
  @Autowired
  private CollegeService collegeService;
  @Autowired
  private MajorService majorService;
  @Autowired
  private StudentService studentService;

  public String index() throws Exception {
    majorList = new ArrayList<>();
    collegeList = new ArrayList<>();
    studentsList = studentService.findAllStudent();
    for (Major major : majorService.findAllMajor()) {
      majorList.add(major.getName());
    }
    for (College college : collegeService.findCollege()) {
      collegeList.add(college.getName());
    }
    return SUCCESS;
  }

  public String insert() throws Exception {
    student = new Student();
    student.setName(name);
    student.setAge(age);
    student.setSex(sex);
    student.setHobby(hobby);
    student.setMajor(majorService.findMajor(major));
    System.out.println("***********\n" + major + "\n************");
    System.out.println(majorService.findMajor(major));
    studentService.insertStudent(student);
    return SUCCESS;
  }

  public String update() throws Exception {
    student = studentService.findStudent(id);
    student.setName(name);
    student.setAge(age);
    student.setSex(sex);
    student.setHobby(hobby);
    student.setMajor(majorService.findMajor(major));
    System.out.println("**********\n" + student + "\n**********");
    studentService.updateStudent(student);
    return SUCCESS;
  }

  public String delete() throws Exception {
    student = studentService.findStudent(id);
    studentService.deleteStudent(student);
    return SUCCESS;
  }

  public String updateView() throws Exception {
    majorList = new ArrayList<>();
    collegeList = new ArrayList<>();
    for (Major major : majorService.findAllMajor()) {
      majorList.add(major.getName());
    }
    for (College college : collegeService.findCollege()) {
      collegeList.add(college.getName());
    }
    student = studentService.findStudent(id);
    return SUCCESS;
  }

  public String[] getHobbyChoose(){
    return student.getHobby().split(", ");
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

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public String getCollege() {
    return college;
  }

  public void setCollege(String college) {
    this.college = college;
  }

  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  public List<String> getMajorList() {
    return majorList;
  }

  public void setMajorList(List<String> majorList) {
    this.majorList = majorList;
  }

  public List<String> getCollegeList() {
    return collegeList;
  }

  public void setCollegeList(List<String> collegeList) {
    this.collegeList = collegeList;
  }

  public CollegeService getCollegeService() {
    return collegeService;
  }

  public void setCollegeService(CollegeService collegeService) {
    this.collegeService = collegeService;
  }

  public MajorService getMajorService() {
    return majorService;
  }

  public void setMajorService(MajorService majorService) {
    this.majorService = majorService;
  }

  public StudentService getStudentService() {
    return studentService;
  }

  public void setStudentService(StudentService studentService) {
    this.studentService = studentService;
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
