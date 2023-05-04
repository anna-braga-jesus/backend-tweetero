package com.tweetero.projetao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetero.projetao.models.User;

public interface UserRepository extends JpaRepository<User, String> {
    
}
