package com.tweetero.projetao.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.projetao.dto.UserDTO;
import com.tweetero.projetao.service.UserService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tweetero")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public void teste(@RequestBody @Valid UserDTO req){
        System.out.println(req);
    }

    @PostMapping("/signup")
    @ResponseStatus(code = HttpStatus.CREATED)
    public String signUp(@RequestBody @Valid UserDTO req) {                
        service.signUp(req); 
        return "Ok";
    }

}
