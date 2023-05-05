package com.tweetero.projetao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetService {
    
    @Autowired
    private TweetRepository repository;
}
