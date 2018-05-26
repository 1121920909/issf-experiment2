package com.zyp.issf.domain;

import javax.persistence.*;

@Entity
@Table(name = "student",schema = "issf")
public class Student {
    private int id;
    private String name;
    private Major major;
    private String sex;
    private String hobby;
    private String age;

    @Id
    @GeneratedValue
    @Column(name = "id",unique = true,nullable = false,length = 11,insertable = false,updatable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name",length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "sex",length = 45)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Column(name = "hobby",length = 45)
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Column(name = "age",length = 45)
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @ManyToOne(targetEntity = Major.class)
    @JoinColumn(name = "major_id")
    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major=" + major +
                ", sex='" + sex + '\'' +
                ", hobby='" + hobby + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
