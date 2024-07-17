package com.scaler.Splitwise.repository;

import com.scaler.Splitwise.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Users, Long> {
}
