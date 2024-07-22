package com.scaler.Splitwise.repository;

import com.scaler.Splitwise.model.UserExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserExpenseRepository extends JpaRepository<UserExpense, Long> {
}
