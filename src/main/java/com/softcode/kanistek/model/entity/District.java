package com.softcode.kanistek.model.entity;

import com.softcode.kanistek.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;


@Entity
public class District extends BaseEntity {
    @Column(nullable = false)
    private String name;
    @ManyToOne
    private City city;
}
