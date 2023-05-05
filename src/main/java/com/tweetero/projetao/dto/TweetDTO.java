package com.tweetero.projetao.dto;

import jakarta.validation.constraints.NotNull;

public record TweetDTO(
    @NotNull String username,
    @NotNull String tweet
) {

    public String username() {
        return username;
    }

    public String tweet() {
        return tweet;
    }
    
}
