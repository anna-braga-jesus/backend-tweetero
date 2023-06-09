package com.tweetero.projetao.models;

import org.hibernate.validator.constraints.URL;

import com.tweetero.projetao.annotations.JsonElement;
import com.tweetero.projetao.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class TweetModel {

    public TweetModel(TweetDTO req){
        this.username = req.username();
        this.avatar = req.avatar();
        this.tweet = req.tweet();
    }
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

     @Column(length = 20, nullable = false)
     @JsonElement
     private String username;

     @Column
     @URL
     private String avatar;
    
     @Column(length = 300 ,nullable = false)
     private String tweet;

}

