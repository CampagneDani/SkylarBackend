package org.example.BackEndSkylar.service;

import org.example.BackEndSkylar.exception.UserNotFoundException;
import org.example.BackEndSkylar.model.DBFunction;
import org.example.BackEndSkylar.model.User;
import org.example.BackEndSkylar.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    private final UserRepo userRepo;


    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public User addUser(User user){
        userRepo.save(user);
        DBFunction.securePW(user);
        return findUserById(user.getId());
    }

    public List<User> findAllUser(){
        return userRepo.findAll();
    }

    public User findUserById(Long id){
        return userRepo.findUserById(id).orElseThrow(() -> new UserNotFoundException("User by id "+ id + "was not found"));
    }

    public User updateUser(Long id,User user){
        User updatedUser = user;
        updatedUser.setId(id);
        return userRepo.save(user);
    }

    public void deleteUser(Long id){
        userRepo.delete(findUserById(id));
    }


}
