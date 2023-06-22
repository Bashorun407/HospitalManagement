package com.akinnova.hospitalManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "hospital_table", uniqueConstraints = {
        @UniqueConstraint(columnNames = "contactNumber"),
        @UniqueConstraint(columnNames = "registrationNumber")
})

public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hospital_id")
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
