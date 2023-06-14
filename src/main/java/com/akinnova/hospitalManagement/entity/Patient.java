package com.akinnova.hospitalManagement.entity;

import com.akinnova.hospitalManagement.entity.AbstractClass.BaseEntity;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "patient_table")
@Builder
public class Patient extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long patientId;
    private String firstName;
    private String lastName;
    private String registrationNumber;
    private String gender;
    private Date dateOfBirth;
    private String emergencyContactName;
    private String emergencyContactNumber;
}
