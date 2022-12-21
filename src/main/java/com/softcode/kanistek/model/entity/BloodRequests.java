package com.softcode.kanistek.model.entity;

import com.softcode.kanistek.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BloodRequests extends BaseEntity {
    @ManyToOne
    @JoinColumn(updatable = false,insertable = false,name = "publisher_id")
    private User publisher;
    @Column(name = "publisher_id")
    private int publisherId;

    @ManyToOne
    @JoinColumn(updatable = false,insertable = false,name = "blood_id")
    private Blood blood;
    @Column(name = "blood_id")
    private int bloodId;

}
