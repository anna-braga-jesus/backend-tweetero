package com.tweetero.projetao.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetero.projetao.models.TweetModel;

public interface TweetRepository extends JpaRepository<TweetModel, Long> {
    Page<TweetModel> findAll(Pageable pageable);
    public List<TweetModel> findByUsername(String username);

}
