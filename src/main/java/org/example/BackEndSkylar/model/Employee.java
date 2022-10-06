package org.example.BackEndSkylar.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phoneNr;
    private String imgUrl;
    @Column(nullable = false,updatable = false)
    private String employeeCode;


    public Employee() {}

    public Employee(long id, String name, String email, String jobTitle, String phoneNr, String imgUrl, String emploeyeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phoneNr = phoneNr;
        this.imgUrl = imgUrl;
        this.employeeCode = emploeyeCode;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getEmploeyeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employyeCode) {
        this.employeeCode = employyeCode;
    }




    @Override
    public String toString(){
        return "Employee{" +
                "id= "+ id +
                ", email= " + email +
                ", jobTitle= " + jobTitle +
                ", phone= " + phoneNr +
                ", imageUrl= " + imgUrl +
                '}';
    }

}
