package com.tweetero.projetao.models;

import com.tweetero.projetao.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class User {
    public User(UserDTO req){
        this.username = req.username();
        this.avatar = req.avatar();
    }

    @Column(length = 50, nullable = false, unique = true)
    @Id
    private String username;


    @Column(length = 300, nullable = false)
    private String avatar;
}
