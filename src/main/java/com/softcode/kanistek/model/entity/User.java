package com.softcode.kanistek.model.entity;

import com.softcode.kanistek.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "users")
@Data
public class User extends BaseEntity {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String telephone;
    @Column(nullable = false,columnDefinition = "boolean default false")
    private Boolean isEnabled=false;

}
