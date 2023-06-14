package com.akinnova.hospitalManagement.dto;

import com.akinnova.hospitalManagement.dto.AbstractClass.BaseEntityDto;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class HospitalDto extends BaseEntityDto {
    private Long hospitalId;
    private String hospitalName;
    private String address;
    private String city;
    private String website;
    private String registrationNumber;
    private LocalDateTime startedOperation;

}
