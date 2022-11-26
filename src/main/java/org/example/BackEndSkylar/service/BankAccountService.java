package org.example.BackEndSkylar.service;
import org.example.BackEndSkylar.exception.BankAccountNotFoundException;
import org.example.BackEndSkylar.model.BankAccount;
import org.example.BackEndSkylar.repo.BankAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * part of the springboot mechanism to interact with the data given and gotten to/from the font-end via http-requests
 * same for every other "Service" -class
 */

@Service
public class BankAccountService {

    private final BankAccountRepo bankAccountRepo;


    @Autowired
    public BankAccountService(BankAccountRepo bankAccountRepo){
        this.bankAccountRepo = bankAccountRepo;
    }

    public BankAccount addBankAccount(BankAccount bankAccount){
        return bankAccountRepo.save(bankAccount);
    }

    public List<BankAccount> findAllBankAccounts(){
        return bankAccountRepo.findAll();
    }

    public BankAccount findBankAccountById(Long id){
        return bankAccountRepo.findBankAccountById(id).orElseThrow(() -> new BankAccountNotFoundException("BankAccount by id"+ id + "was not found"));
    }

    public BankAccount updateBankAccount(BankAccount bankAccount){
        return bankAccountRepo.save(bankAccount);
    }

    public void deleteBankAccount(Long id){
        bankAccountRepo.delete(findBankAccountById(id));
    }


}
