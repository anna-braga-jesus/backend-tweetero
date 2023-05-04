package com.tweetero.projetao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.projetao.dto.UserDTO;
import com.tweetero.projetao.models.User;
import com.tweetero.projetao.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweetero")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody @Valid UserDTO req) {                
        service.singUp(req); 
        return ResponseEntity.status(201).body("Ok");
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return service.findAll();
        }
}
