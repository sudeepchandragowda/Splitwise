package com.scaler.Splitwise.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
@Entity (name = "SPLITWISE_EXPENSE")
public class Expense extends BaseModel {
    private String description;
    private double amount;
    @OneToMany
    private List<UserExpense> userExpenses;
    @ManyToOne
    private Group group;
    @Enumerated(EnumType.ORDINAL)
    private Currency currency;
}
/*
{
    "description": "Dinner"
    "amount": 1000,
    "group": 1,
    "currency": "INR"
    "userExpense": [
        {
            "name" : "Rithuraj",
            "amount" : 500,
            "userExpenseType: : "paid"
       },
       {
            "name" : "Omkar",
            "amount" : 500,
            "userExpenseType: : "paid"
       },
       {
            "name" : "A",
            "amount" : 1000,
            "userExpenseType: : "hasTopay"
       } ]
}

 */
