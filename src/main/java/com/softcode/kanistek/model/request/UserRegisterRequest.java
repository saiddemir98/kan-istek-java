package com.softcode.kanistek.model.request;

import lombok.Data;

@Data
public class UserRegisterRequest {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String telephone;
}
