package com.akinnova.hospitalManagement.entity;

import com.akinnova.hospitalManagement.entity.AbstractClass.BaseEntity;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "Staff_table")
@Builder
public class Staff extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private Long staffId;
    @ManyToOne
    @JoinColumn(name = "hospitalId")
    //@ForeignKey(name = "FK_Staff_Hospital")
    private Hospital hospitalId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String jobTitle;
    private String department;
    private String licenseNumber;
    private Date dateOfBirth;

    @CreationTimestamp
    private Date dateEmployed;

}

