package com.zyp.issf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "college",schema = "issf")
public class College {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Id
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
}
