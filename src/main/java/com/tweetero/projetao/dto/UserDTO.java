package com.tweetero.projetao.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserDTO(
    @NotNull @NotBlank String username, 

    @NotNull
    @NotBlank
    @URL
    String avatar
) {
    
}
