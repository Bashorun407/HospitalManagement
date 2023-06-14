package com.akinnova.hospitalManagement.dto;

import com.akinnova.hospitalManagement.dto.AbstractClass.BaseEntityDto;
import com.akinnova.hospitalManagement.entity.Hospital;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class StaffDto extends BaseEntityDto {
    private Long staffId;
    private Hospital hospitalId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String jobTitle;
    private String department;
    private String licenseNumber;
    private Date dateOfBirth;
    private Date dateEmployed;

}
