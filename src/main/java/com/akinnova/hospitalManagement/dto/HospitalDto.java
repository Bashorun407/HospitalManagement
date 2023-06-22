package com.akinnova.hospitalManagement.dto;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Builder
public class HospitalDto {
    private Long hospitalId;
    private String hospitalName;
    private String city;
    private String website;
    private String registrationNumber;
    private LocalDateTime startedOperation;
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
