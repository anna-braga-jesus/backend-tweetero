package com.tweetero.projetao.dto;

import jakarta.validation.constraints.NotNull;


public record UserDTO(
    @NotNull String username,
    @NotNull String avatar
){

    public String getUsername() {
        return username;
    }

    public String getAvatar() {
        return avatar;
    }

}

