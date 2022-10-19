package org.example.BackEndSkylar.service;

import org.example.BackEndSkylar.exception.BudgetNotFoundException;
import org.example.BackEndSkylar.model.Budget;
import org.example.BackEndSkylar.repo.BudgetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BudgetService {

    private final BudgetRepo budgetRepo;


    @Autowired
    public BudgetService(BudgetRepo budgetRepo){
        this.budgetRepo = budgetRepo;
    }

    public Budget addBudget(Budget budget){
        return budgetRepo.save(budget);
    }

    public List<Budget> findAllBudgets(){
        return budgetRepo.findAll();
    }

    public Budget findBudgetById(Long id){
        return budgetRepo.findBudgetById(id).orElseThrow(() -> new BudgetNotFoundException("Budget by id "+ id + "was not found"));
    }

    public Budget updateBudget(Budget budget){
        return budgetRepo.save(budget);
    }

    public void deleteBudget(Long id){
        budgetRepo.deleteBudgetById(id);
    }


}
