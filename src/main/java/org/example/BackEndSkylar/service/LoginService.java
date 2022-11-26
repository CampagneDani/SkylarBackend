package org.example.BackEndSkylar.service;

import org.example.BackEndSkylar.model.*;
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
        if (Objects.equals(properUser.getPassword(), DBFunction.comparePW(loginData.password))){
            return new AuthToken(properUser.getUsername(),properUser.getPassword(),properUser.getRole());
        }

        return null;
    }



}
