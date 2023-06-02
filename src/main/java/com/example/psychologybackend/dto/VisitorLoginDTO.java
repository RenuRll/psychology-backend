package com.example.psychologybackend.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class VisitorLoginDTO {

    @NotBlank
    private String code;
}
