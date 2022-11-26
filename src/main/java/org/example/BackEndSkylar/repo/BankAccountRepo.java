package org.example.BackEndSkylar.repo;

import org.example.BackEndSkylar.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * part of the springboot mechanism to communicate with the database
 * same for every other "repo" - interface
 */


public interface BankAccountRepo extends JpaRepository<BankAccount, Long> {

    void delete(BankAccount bankAccount);

    Optional<BankAccount> findBankAccountById(Long id);

}
