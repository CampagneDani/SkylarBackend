package org.example.BackEndSkylar.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String projectName;
    private String projectDescription;
    @ManyToMany
    @JoinColumn(name = "assigned_user_id")
    private List<User> assignedUserId;


    public Project() {
    }

    public Project(Long id, String projectName, String projectDescription, List<User> assignedUserId) {
        this.id = id;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.assignedUserId = assignedUserId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
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

    public List<User> getAssignedUserId() {
        return assignedUserId;
    }

    public void setAssignedUserId(List<User> assignedUserId) {
        this.assignedUserId = assignedUserId;
    }
}
