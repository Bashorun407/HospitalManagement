package com.akinnova.hospitalManagement.dto.AbstractClass;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data

public abstract class BaseEntityDto {
    private String createdBy;
    private Date dateCreated;
    private String modifiedBy;
    private Date dateModified;
    private String address;
    private String contactNumber;
    private String email;
}
