package com.scaler.Splitwise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "SPLITWISE_USER")
public class Users extends BaseModel {
    private String name;
    private String email;
    private String phoneNumber;
    @ManyToMany
    private List<Group> groups;
    @OneToMany
    private List<UserExpense> userExpenses;
}
