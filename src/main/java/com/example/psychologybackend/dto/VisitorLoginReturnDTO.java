package com.example.psychologybackend.dto;


import lombok.Data;

@Data
public class VisitorLoginReturnDTO {
        private String token;
        private String sessionKey;
        private String vid;
        private String name;
        private String phone;
        private String avatarUrl;
}
