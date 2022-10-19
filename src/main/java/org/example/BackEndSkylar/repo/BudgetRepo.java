package org.example.BackEndSkylar.repo;

import org.example.BackEndSkylar.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BudgetRepo extends JpaRepository<Budget, Long> {

    void deleteBudgetById(Long id);

    Optional<Budget> findBudgetById(Long id);
}
