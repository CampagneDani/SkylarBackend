package org.example.BackEndSkylar.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String projectName;
    private String projectDescription;

    @JoinColumn(name = "assigend_user_id")
    private Long assigend_user_id;


    public Project() {
    }

    public Project(Long id, String projectName, String projectDescription, Long assigend_user_id) {
        this.id = id;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.assigend_user_id = assigend_user_id;
    }

    public String getProjectName() {
        return projectName;
    }

    public Long getAssigend_user_id() {
        return assigend_user_id;
    }

    public void setAssigend_user_id(Long assigend_user_id) {
        this.assigend_user_id = assigend_user_id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
