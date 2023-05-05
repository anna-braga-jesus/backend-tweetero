package com.tweetero.projetao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.projetao.dto.TweetDTO;
import com.tweetero.projetao.service.TweetService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tweetero")
public class TweetController {

    @Autowired
    private TweetService service;

    @PostMapping("/tweets")
    @ResponseStatus(HttpStatus.CREATED)
    public String createTweet(@RequestBody @Valid TweetDTO req){
        service.createTweet(req);
        return "OK";
    }



}
