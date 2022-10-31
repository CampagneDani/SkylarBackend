package org.example.BackEndSkylar.repo;

import org.example.BackEndSkylar.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepo extends JpaRepository<Project, Long> {

    void delete(Project project);

    Optional<Project> findProjectById(Long id);
}
