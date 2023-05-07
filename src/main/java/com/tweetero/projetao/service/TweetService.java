package com.tweetero.projetao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tweetero.projetao.dto.TweetDTO;
import com.tweetero.projetao.models.TweetModel;
import com.tweetero.projetao.repository.TweetRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
public class TweetService {
    
        @Autowired
        private TweetRepository repository;
        
        public Page<TweetModel> findAll(SpringDataWebProperties.Pageable pageable) {
            int page = 0; 
            int size = 5; 
            Sort sort = Sort.by("id").descending();
    
            PageRequest pageRequest = PageRequest.of(page, size, sort);
    
            return repository.findAll(pageRequest);
        }
    
        
        public void createATweet(@RequestBody @Valid TweetDTO req){
            repository.save(new TweetModel(req));
        }

        public List<TweetModel> getByUser( String username){
            return repository.findByUsername(username);
        }
}
