package com.akinnova.hospitalManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "patient_table", uniqueConstraints = {
        @UniqueConstraint(columnNames = "registrationNumber"),
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "contactNumber")
})

public class Patient {
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
    private String address;
    private String contactNumber;
    private String email;
    private String createdBy;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    private String modifiedBy;
    @UpdateTimestamp
    private LocalDateTime dateModified;
}
