package org.example.BackEndSkylar.repo;

import org.example.BackEndSkylar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    void delete(User user);

    Optional<User> findUserById(Long id);
    Optional<User> findUserByUsername(String username);
}
