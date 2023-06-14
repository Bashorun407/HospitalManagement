package com.akinnova.hospitalManagement.entity.AbstractClass;

import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseEntity {
    private String createdBy;
    private Date dateCreated;
    private String modifiedBy;
    private Date dateModified;
    private String address;
    private String contactNumber;
    private String email;
}
