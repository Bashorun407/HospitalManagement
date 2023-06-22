package com.akinnova.hospitalManagement.dto;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
@Data
@Builder
public class StaffDto {

    private Long staffId;
    private Long hospitalId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String jobTitle;
    private String department;
    private String licenseNumber;
    private Date dateOfBirth;
    private Date dateEmployed;
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
