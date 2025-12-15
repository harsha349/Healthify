package com.example.healthify.users.repo;

import com.example.healthify.users.entity.PasswordResetCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface passwordRestRepo extends JpaRepository<PasswordResetCode, Long> {

    Optional<PasswordResetCode> findByCode (String code);
    void deleteByUserID(Long userId);
}
