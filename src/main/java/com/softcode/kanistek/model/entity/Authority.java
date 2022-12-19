package com.softcode.kanistek.model.entity;

import com.softcode.kanistek.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Data
public class Authority extends BaseEntity implements GrantedAuthority {
    @Column(nullable = false)
    private String authority;

}
