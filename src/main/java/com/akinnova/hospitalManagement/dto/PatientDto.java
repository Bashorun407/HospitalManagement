package com.akinnova.hospitalManagement.dto;

import com.akinnova.hospitalManagement.dto.AbstractClass.BaseEntityDto;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class PatientDto extends BaseEntityDto {
    private Long patientId;
    private String firstName;
    private String lastName;
    private String registrationNumber;
    private String gender;
    private Date dateOfBirth;
    private String emergencyContactName;
    private String emergencyContactNumber;

}
