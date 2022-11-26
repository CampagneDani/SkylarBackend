package org.example.BackEndSkylar;

import org.example.BackEndSkylar.model.Project;
import org.example.BackEndSkylar.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/project")
public class ProjectResource {

    private final ProjectService projectService;

    public ProjectResource(ProjectService projectService){
        this.projectService = projectService;
    }


    @GetMapping()
    public ResponseEntity<List<Project>> getAllProjects(){
        List<Project> projects = projectService.findAllProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable("id") Long id){
        Project project = projectService.findProjectById(id);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Project> addProject(@RequestBody Project project){
        Project newProject = projectService.addProject(project);
        return new ResponseEntity<>(newProject, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Project> updateProject(@PathVariable("id") Long id,@RequestBody Project project){
        Project updateProject = projectService.updateProject(id, project);
        return new ResponseEntity<>(updateProject, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable("id") Long id){
        projectService.deleteProject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
