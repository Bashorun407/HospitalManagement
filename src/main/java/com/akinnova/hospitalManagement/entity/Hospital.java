package com.akinnova.hospitalManagement.entity;

import com.akinnova.hospitalManagement.entity.AbstractClass.BaseEntity;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Entity(name = "Hospital_table")
@Builder
public class Hospital extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hospital_id")
    private Long hospitalId;
    private String hospitalName;
    private String address;
    private String city;
    private String website;
    private String registrationNumber;
    @CreationTimestamp
    private LocalDateTime startedOperation;

    @OneToMany
    private Staff staff;
}
