package com.scaler.Splitwise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.HashMap;

@Data
@Entity (name = "SPLITWISE_EXPENSE")
public class Expense extends BaseModel {
    private String description;
    private double amount;
    private HashMap<Users, Double> paidUsers;
    private HashMap<Users, Double> hasToPayUsers;
    @ManyToOne
    private Group group;
    @Enumerated(EnumType.ORDINAL)
    private Currency currency;
}
