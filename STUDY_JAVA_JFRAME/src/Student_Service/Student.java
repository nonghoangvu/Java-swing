/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student_Service;

import java.io.Serializable;

/**
 *
 * @author NONG HOANG VU
 */
public class Student implements Serializable {
    private String name;
    private String id;
    private String email;
    private String password;
    private int gender;
    private Boolean status;
    private String major;

    public Student() {
    }

    public Student(String name, String id, String email, String password, int gender, Boolean status, String major) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.status = status;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
