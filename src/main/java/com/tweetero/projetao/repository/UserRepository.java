package com.tweetero.projetao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetero.projetao.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    
}
