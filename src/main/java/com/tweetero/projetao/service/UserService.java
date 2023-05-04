package com.tweetero.projetao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetero.projetao.dto.UserDTO;
import com.tweetero.projetao.models.User;
import com.tweetero.projetao.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void singUp(UserDTO data ){
        repository.save(new User(data));
        }

        public List<User> findAll(){
            return repository.findAll();
        }
}
