package com.companyname.Full.Stack.repository;

import com.companyname.Full.Stack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
