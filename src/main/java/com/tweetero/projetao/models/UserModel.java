package com.tweetero.projetao.models;

import com.tweetero.projetao.annotations.JsonElement;
import com.tweetero.projetao.dto.UserDTO;

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
public class UserModel {
    
    public UserModel(UserDTO req){
        this.username = req.username();
        this.avatar = req.avatar();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

     @Column(length = 20, nullable = false)
     @JsonElement
     private String username;

     @Column(length = 300 ,nullable = false)
     private String avatar;

}


// @Data
// @Entity
// @NoArgsConstructor
// public class User {

//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     private Long id;

//     @Column(length = 20, nullable = false)
//     @JsonElement
//     private String username;

//     @Column(length = 300 ,nullable = false)
//     private String avatar;

//     public User(UserDTO data){
//         this.username = data.getUsername();
//         this.avatar = data.getAvatar();
//     }
// }