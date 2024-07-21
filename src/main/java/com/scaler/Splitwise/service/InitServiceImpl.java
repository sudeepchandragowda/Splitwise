package com.scaler.Splitwise.service;

import com.scaler.Splitwise.model.Users;
import com.scaler.Splitwise.repository.ExpenseRepository;
import com.scaler.Splitwise.repository.GroupRepository;
import com.scaler.Splitwise.repository.UserExpenseRepository;
import com.scaler.Splitwise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        userRepository.save(rahul);
        userRepository.save(omkar);
        userRepository.save(deepak);
        userRepository.save(veena);
    }
}
