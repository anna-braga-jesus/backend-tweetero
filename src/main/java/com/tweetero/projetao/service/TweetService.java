package com.tweetero.projetao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetero.projetao.dto.TweetDTO;
import com.tweetero.projetao.models.TweetModel;
import com.tweetero.projetao.repository.TweetRepository;

@Service
public class TweetService {

    @Autowired
    private TweetRepository repository;

    public void createATweet(TweetDTO req){
        repository.save(new TweetModel(req));
    }
}
