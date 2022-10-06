package org.example.BackEndSkylar;

import org.example.BackEndSkylar.model.Benutzer;
import org.example.BackEndSkylar.service.BenutzerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class BenutzerResource {
    private final BenutzerService benutzerService;

    public BenutzerResource(BenutzerService benutzerService) {
        this.benutzerService = benutzerService;
    }


    @GetMapping()
    public ResponseEntity<List<Benutzer>> getAllBenutzer(){
        List<Benutzer> benutzer = benutzerService.findAllBenutzer();
        return new ResponseEntity<>(benutzer, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Benutzer> getBenutzerById(@PathVariable("id") Long id){
        Benutzer benutzer = benutzerService.findBenutzerById(id);
        return new ResponseEntity<>(benutzer, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Benutzer> addBenutzer(@RequestBody Benutzer benutzer){
        Benutzer neuerBenutzer = benutzerService.addBenutzer(benutzer);
        return new ResponseEntity<>(neuerBenutzer, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Benutzer> updateBenutzer(@RequestBody Benutzer benutzer){
        Benutzer updateBenutzer = benutzerService.updateBenutzer(benutzer);
        return new ResponseEntity<>(updateBenutzer, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBenutzer(@PathVariable("id") Long id){
        benutzerService.deleteBenutzer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
