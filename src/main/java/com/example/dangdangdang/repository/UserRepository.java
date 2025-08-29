package com.example.dangdangdang.repository;

import com.example.dangdangdang.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,String> {
    Object findByUserPassword(String userPassword);

    String findByUserPassword();

    Optional<UserEntity> findById(String id);

    Optional<UserEntity> findByUserId(String id);

    Object findByUserName(String userName);

    Optional<UserEntity> findByUserName(String userName);

    String findByUserEmail(String userEmail);
}
