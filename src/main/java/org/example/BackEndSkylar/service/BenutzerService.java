package org.example.BackEndSkylar.service;

import org.example.BackEndSkylar.exception.UserNotFoundException;
import org.example.BackEndSkylar.model.Benutzer;
import org.example.BackEndSkylar.model.Employee;
import org.example.BackEndSkylar.repo.BenutzerRepo;
import org.example.BackEndSkylar.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BenutzerService {
    private final BenutzerRepo benutzerRepo;


    @Autowired
    public BenutzerService(BenutzerRepo benutzerRepo){
        this.benutzerRepo = benutzerRepo;
    }

    public Benutzer addBenutzer(Benutzer benutzer){
        return benutzerRepo.save(benutzer);
    }

    public List<Benutzer> findAllBenutzer(){
        return benutzerRepo.findAll();
    }

    public Benutzer findBenutzerById(Long id){
        return benutzerRepo.findBenutzerById(id).orElseThrow(() -> new UserNotFoundException("User by id "+ id + "was not found"));
    }

    public Benutzer updateBenutzer(Benutzer benutzer){
        return benutzerRepo.save(benutzer);
    }

    public void deleteBenutzer(Long id){
        benutzerRepo.deleteBenutzerById(id);
    }


}
