package com.tweetero.projetao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetero.projetao.dto.UserDTO;
import com.tweetero.projetao.models.UserModel;
import com.tweetero.projetao.repository.UserRepository;


@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public void signUp(UserDTO req){
        repository.save(new UserModel(req));
    }
}