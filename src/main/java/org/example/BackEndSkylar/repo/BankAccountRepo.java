package org.example.BackEndSkylar.repo;

import org.example.BackEndSkylar.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface BankAccountRepo extends JpaRepository<BankAccount, Long> {

    void deleteBankAccountById(Long id);

    Optional<BankAccount> findBankAccountById(Long id);

}
