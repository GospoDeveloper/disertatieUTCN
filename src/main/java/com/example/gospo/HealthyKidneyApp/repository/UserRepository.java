package com.example.gospo.HealthyKidneyApp.repository;

import com.example.gospo.HealthyKidneyApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {
    User findByEmail(String email);
}
