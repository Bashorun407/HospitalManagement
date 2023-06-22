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
@Table(name = "staff_table", uniqueConstraints = {
        @UniqueConstraint(columnNames = "licenseNumber"),
        @UniqueConstraint(columnNames = "contactNumber"),
        @UniqueConstraint(columnNames = "email")
})

public class Staff{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
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

