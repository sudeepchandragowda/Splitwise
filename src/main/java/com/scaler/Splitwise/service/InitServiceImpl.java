package com.scaler.Splitwise.service;

import com.scaler.Splitwise.model.Users;
import com.scaler.Splitwise.repository.ExpenseRepository;
import com.scaler.Splitwise.repository.GroupRepository;
import com.scaler.Splitwise.repository.UserExpenseRepository;
import com.scaler.Splitwise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InitServiceImpl implements InitService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ExpenseRepository expenseRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private UserExpenseRepository userExpenseRepository;
    @Override
    public void initialise() {
        Users omkar = new Users();
        omkar.setName("Omkar Akkirampalli");
    }
}
