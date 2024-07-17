package com.scaler.Splitwise.repository;

import com.scaler.Splitwise.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <Users, Long> {

}
