package com.tweetero.projetao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.projetao.dto.TweetDTO;
import com.tweetero.projetao.models.TweetModel;
import com.tweetero.projetao.service.TweetService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tweets")
public class TweetController {

    @Autowired
    private TweetService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public String createATweet(@RequestBody @Valid TweetDTO req) {                
        service.createATweet(req); 
        return "Ok";
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public Page<TweetModel> findAll(@PageableDefault(page = 0, size = 5) @RequestParam Pageable page) {
        return service.findAll(page);
    }
    
    @GetMapping("/{username}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<TweetModel> getByUsername(@PageableDefault(size = 5, page = 0) @PathVariable String username){
        return service.getByUser(username);
    }
    
}
