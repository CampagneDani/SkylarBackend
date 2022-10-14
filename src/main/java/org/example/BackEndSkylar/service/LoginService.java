package org.example.BackEndSkylar.service;

import org.example.BackEndSkylar.model.AuthToken;
import org.example.BackEndSkylar.model.Login;
import org.example.BackEndSkylar.model.LoginResponse;
import org.example.BackEndSkylar.model.User;
import org.example.BackEndSkylar.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class LoginService {

    private final UserRepo userRepo;


    @Autowired
    public LoginService(UserRepo userRepo){
        this.userRepo = userRepo;

    }


    public User addUser(User user){
        return userRepo.save(user);
    }

    public AuthToken login(Login loginData){
        Optional<User> user = this.userRepo.findUserByUsername(loginData.username);
        User properUser = user.get();
        if (Objects.equals(properUser.getPassword(), loginData.password)){
            return new AuthToken(properUser.getUsername(),properUser.getPassword(),properUser.getRole());
        }

        //loginToken muss dann in der DB abgespeichtert werden
        //loginResponse wird returned
        //Jeder user 1 rolle 1 zu 1, Response gibt die Rolle mit, dh Rolle muss ausgelesen werden und mitzurückgeben
        return null;
    }



}
