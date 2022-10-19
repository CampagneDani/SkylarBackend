package org.example.BackEndSkylar;

import org.example.BackEndSkylar.model.BankAccount;
import org.example.BackEndSkylar.model.User;
import org.example.BackEndSkylar.service.BankAccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankAccount")
public class BankAccountResource {

    private final BankAccountService bankAccountService;

    public BankAccountResource(BankAccountService bankAccountService){
        this.bankAccountService = bankAccountService;
    }


    @GetMapping()
    public ResponseEntity<List<BankAccount>> getAllBankAccounts(){
        List<BankAccount> bankAccounts = bankAccountService.findAllBankAccounts();
        return new ResponseEntity<>(bankAccounts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BankAccount> getBankAccountById(@PathVariable("id") Long id){
        BankAccount bankAccount = bankAccountService.findBankAccountById(id);
        return new ResponseEntity<>(bankAccount, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<BankAccount> addBankAccount(@RequestBody BankAccount bankAccount){
        BankAccount newBankAccount = bankAccountService.addBankAccount(bankAccount);
        return new ResponseEntity<>(newBankAccount, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<BankAccount> updateBankAccount(@RequestBody BankAccount bankAccount){
        BankAccount updateBankAccount = bankAccountService.updateBankAccount(bankAccount);
        return new ResponseEntity<>(updateBankAccount, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBankAccount(@PathVariable("id") Long id){
        bankAccountService.deleteBankAccount(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
