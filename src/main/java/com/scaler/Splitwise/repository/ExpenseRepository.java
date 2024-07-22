package com.scaler.Splitwise.repository;

import com.scaler.Splitwise.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
