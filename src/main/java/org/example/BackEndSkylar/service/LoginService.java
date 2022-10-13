package org.example.BackEndSkylar.service;

import org.example.BackEndSkylar.exception.UserNotFoundException;
import org.example.BackEndSkylar.model.Login;
import org.example.BackEndSkylar.model.LoginResponse;
import org.example.BackEndSkylar.model.User;
import org.example.BackEndSkylar.repo.LoginTokenRepo;
import org.example.BackEndSkylar.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {

    private final LoginTokenRepo loginRepo;
    private final UserRepo userRepo;


    @Autowired
    public LoginService(UserRepo userRepo, LoginTokenRepo loginRepo){
        this.userRepo = userRepo;
        this.loginRepo = loginRepo;
    }


    public User addUser(User user){
        return userRepo.save(user);
    }

    public LoginResponse login(Login loginData){
        Optional<User> user = this.userRepo.findUserByUsername(loginData.username);
        //password abgleich
        //wenn pw t =nich> error response
        //wenn übereinstimmt =>  loginToken wird generiert (zufällige Stringkette)
        //loginToken muss dann in der DB abgespeichtert werden
        //loginResponse wird returned
        //Jeder user 1 rolle 1 zu 1, Response gibt die Rolle mit, dh Rolle muss ausgelesen werden und mitzurückgeben
        return null;
    }



}
