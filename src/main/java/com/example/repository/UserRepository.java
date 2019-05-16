package com.example.repository;

import com.example.entity.User2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User2,Long> {
    User2 findUserById(long id);
}
