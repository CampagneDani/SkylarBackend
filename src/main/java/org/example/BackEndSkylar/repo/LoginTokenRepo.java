package org.example.BackEndSkylar.repo;

import org.example.BackEndSkylar.model.Login;
import org.example.BackEndSkylar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginTokenRepo extends JpaRepository<Login,Long> {


}