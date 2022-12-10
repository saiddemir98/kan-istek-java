package com.softcode.kanistek.model.entity;

import com.softcode.kanistek.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Address extends BaseEntity {
    @ManyToOne
    private City city;
    @ManyToOne
    private District district;
    @Column
    private String zipcode;
    @Column(length = 500)
    private String fulladdress;

}
