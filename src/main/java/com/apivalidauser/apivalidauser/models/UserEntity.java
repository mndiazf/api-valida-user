package com.apivalidauser.apivalidauser.models;


import lombok.Data;

@Data
public class UserEntity {
    private String username;

    public UserEntity(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
