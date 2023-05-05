package com.tweetero.projetao.dto;

//import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;
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


    // public void setUsername(String username) {
    //     this.username = username;
    // }


    // public void setAvatar(String avatar) {
    //     this.avatar = username;
    // }
}

