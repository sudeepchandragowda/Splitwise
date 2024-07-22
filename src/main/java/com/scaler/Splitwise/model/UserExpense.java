package com.scaler.Splitwise.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "SPLITWISE_EXPENSEUSER")
public class UserExpense extends BaseModel{
    @ManyToOne
    private Users user;
    private double amount;
    @Enumerated(EnumType.ORDINAL)
    private UserExpenseType userExpenseType;
}
/*
    @ManyToOne
    private Expense expense;
    Removed as it is not necessary here
 */