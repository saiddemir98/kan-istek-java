package com.softcode.kanistek.model.entity;

import com.softcode.kanistek.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;

@Entity(name = "users")
@Data
public class User extends BaseEntity implements UserDetails {
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
    @Column(nullable = false,columnDefinition = "boolean default true")
    private boolean isAccountNonExpired;
    @Column(nullable = false,columnDefinition = "boolean default true")
    private boolean isAccountNonLocked;
    @Column(nullable = false,columnDefinition = "boolean default true")
    private boolean isCredentialsNonExpired;
    @Column(nullable = false,columnDefinition = "boolean default false")
    private boolean isEnabled;
    @ManyToMany(fetch = FetchType.EAGER)
    private ArrayList<Authority> authorities;




    @Override
    public String getUsername() {
        return this.email;
    }








}
