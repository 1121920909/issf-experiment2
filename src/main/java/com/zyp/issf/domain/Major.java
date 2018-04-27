package com.zyp.issf.domain;

import javax.persistence.*;
import java.lang.annotation.Target;

@Entity
@Table(name = "major",schema = "issf")
public class Major {
    private int id;
    private String name;
    private College college;

    @Id
    @GeneratedValue
    @Column(name = "id",unique = true,nullable = false,length = 11)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name",nullable = false,length = 45)
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(targetEntity = College.class)
    @JoinColumn(name = "college_id",updatable = false,insertable = false)
    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college=" + college +
                '}';
    }
}
