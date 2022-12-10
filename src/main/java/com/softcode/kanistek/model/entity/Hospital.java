package com.softcode.kanistek.model.entity;

import com.softcode.kanistek.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Hospital extends BaseEntity {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String telephone;






}
