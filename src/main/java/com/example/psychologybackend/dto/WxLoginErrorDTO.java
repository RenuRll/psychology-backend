package com.example.psychologybackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WxLoginErrorDTO {
    private int errcode;
    private String errmsg;
    private  String openid;
    @JsonProperty("session_key")
    private  String  sessionKey;
}
