package com.akinnova.hospitalManagement.dto;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
@Data
@Builder
public class PatientDto {
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
