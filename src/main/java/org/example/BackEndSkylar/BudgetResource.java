package org.example.BackEndSkylar;

import org.example.BackEndSkylar.model.Budget;
import org.example.BackEndSkylar.service.BudgetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/budget")
public class BudgetResource {

    private final BudgetService budgetService;

    public BudgetResource(BudgetService budgetService){
        this.budgetService = budgetService;
    }

    @GetMapping()
    public ResponseEntity<List<Budget>> getAllBudgets(){
        List<Budget> budgets = budgetService.findAllBudgets();
        return new ResponseEntity<>(budgets, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Budget> getBudgetById(@PathVariable("id") Long id){
        Budget budget = budgetService.findBudgetById(id);
        return new ResponseEntity<>(budget, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Budget> addBudget(@RequestBody Budget budget){
        Budget newBudget = budgetService.addBudget(budget);
        return new ResponseEntity<>(newBudget, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Budget> updateUser(@RequestBody Budget budget){
        Budget updateBudget = budgetService.updateBudget(budget);
        return new ResponseEntity<>(updateBudget, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBudget(@PathVariable("id") Long id){
        budgetService.deleteBudget(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
