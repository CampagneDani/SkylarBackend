package org.example.BackEndSkylar;

import org.example.BackEndSkylar.model.AuthToken;
import org.example.BackEndSkylar.model.Login;
import org.example.BackEndSkylar.model.User;
import org.example.BackEndSkylar.service.LoginService;
import org.example.BackEndSkylar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginResource {


    private final LoginService loginService;


    @Autowired
    public LoginResource(LoginService loginService){
        this.loginService = loginService;


    }

    @PostMapping()
    public AuthToken login(@RequestBody Login login){
        return loginService.login(login);
    }

}


