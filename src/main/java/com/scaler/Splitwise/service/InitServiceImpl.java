package com.scaler.Splitwise.service;

import com.scaler.Splitwise.model.*;
import com.scaler.Splitwise.repository.ExpenseRepository;
import com.scaler.Splitwise.repository.GroupRepository;
import com.scaler.Splitwise.repository.UserExpenseRepository;
import com.scaler.Splitwise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        Users omkar = Users.builder()
                .email("omkar@email.com")
                    .phoneNumber("1234567890")
                        .name("Omkar Oak")
                            .build();
        Users rahul = Users.builder()
                .email("rahul@email.com")
                .phoneNumber("4234567898")
                .name("Rahul Gowda")
                .build();
        Users deepak = Users.builder()
                .email("deepak@email.com")
                .phoneNumber("9234567590")
                .name("Deepak Kumar")
                .build();
        Users veena = Users.builder()
                .email("veena@email.com")
                .phoneNumber("5237567890")
                .name("Veena Charan")
                .build();

        rahul = userRepository.save(rahul);
        omkar = userRepository.save(omkar);
        deepak = userRepository.save(deepak);
        veena = userRepository.save(veena);

        Group group = new Group();
        group.setDescription("Friends who never pay back on time");
        group.setName("Trip to Goa");
        group.setUsers(List.of(rahul, omkar, deepak, veena));
        group = groupRepository.save(group);


        //4 expenses
        //Expense 1 -> amount 1000, paidBy : Omakr, hasToPay : everyone equal
        UserExpense userExpense = new UserExpense();
        userExpense.setUser(omkar);
        userExpense.setAmount(1000);
        userExpense.setUserExpenseType(UserExpenseType.PAID);
        userExpense = userExpenseRepository.save(userExpense);

        UserExpense userExpense1 = new UserExpense();
        userExpense1.setUser(omkar);
        userExpense1.setAmount(250);
        userExpense1.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpense1 = userExpenseRepository.save(userExpense1);


        UserExpense userExpense2 = new UserExpense();
        userExpense2.setUser(rahul);
        userExpense2.setAmount(250);
        userExpense2.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpense2 = userExpenseRepository.save(userExpense2);


        UserExpense userExpense3 = new UserExpense();
        userExpense3.setUser(deepak);
        userExpense3.setAmount(250);
        userExpense3.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpense3 = userExpenseRepository.save(userExpense3);


        UserExpense userExpense4 = new UserExpense();
        userExpense4.setUser(veena);
        userExpense4.setAmount(250);
        userExpense4.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpense4 = userExpenseRepository.save(userExpense4);


        Expense expense = new Expense();
        expense.setAmount(1000);
        expense.setDescription("Dinner");
        expense.setCurrency(Currency.INR);
        expense.setGroup(group);
        expense.setUserExpenses(List.of(userExpense, userExpense1, userExpense2, userExpense3, userExpense4));

        expenseRepository.save(expense);
    }
}
