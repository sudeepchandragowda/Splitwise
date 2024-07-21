package com.scaler.Splitwise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
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
