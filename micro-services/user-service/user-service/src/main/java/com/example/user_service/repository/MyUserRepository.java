package com.example.user_service.repository;

import com.example.user_service.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser,Long> {
}
