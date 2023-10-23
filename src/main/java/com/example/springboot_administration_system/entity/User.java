package com.example.springboot_administration_system.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    @JsonIgnore
    private String nickname;
    private String email;
    private String phone;
    private String address;

}
