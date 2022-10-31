package org.example.BackEndSkylar.service;


import org.example.BackEndSkylar.exception.ProjectNotFoundException;
import org.example.BackEndSkylar.model.Project;
import org.example.BackEndSkylar.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepo projectRepo;


    @Autowired
    public ProjectService(ProjectRepo projectRepo){
        this.projectRepo = projectRepo;
    }

    public Project addProject(Project project){
        return projectRepo.save(project);
    }

    public List<Project> findAllProjects(){
        return projectRepo.findAll();
    }

    public Project findProjectById(Long id){
        return projectRepo.findProjectById(id).orElseThrow(() -> new ProjectNotFoundException("Project by id "+ id + "was not found"));
    }

    public Project updateProject(Project project){
        return projectRepo.save(project);
    }

    public void deleteProject(Long id){
        projectRepo.delete(findProjectById(id));
    }

}
