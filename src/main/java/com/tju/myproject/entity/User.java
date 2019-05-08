package com.tju.myproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User
{
    @JsonProperty(value = "userID")
    private Integer userID;
    @JsonProperty(value = "nickname")
    private String nickname;
    @JsonProperty(value = "avatar")
    private String avatar;
    @JsonProperty(value = "authority")
    private String authority;
}
