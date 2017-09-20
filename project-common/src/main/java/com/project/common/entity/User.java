package com.project.common.entity;

import com.project.common.abstracts.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "USER")
public class User extends BaseEntity {

    @Column
    private String fullName;

    @Column
    private String username;

    @Column
    private String password;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
