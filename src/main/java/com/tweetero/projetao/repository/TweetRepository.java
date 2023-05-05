package com.tweetero.projetao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetero.projetao.models.TweetModel;

public interface TweetRepository extends JpaRepository<TweetModel, Long>{
    
}


