package org.example.BackEndSkylar.repo;

import org.example.BackEndSkylar.model.Benutzer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BenutzerRepo extends JpaRepository<Benutzer, Long> {

    void deleteBenutzerById(Long id);

    Optional<Benutzer> findBenutzerById(Long id);
}
