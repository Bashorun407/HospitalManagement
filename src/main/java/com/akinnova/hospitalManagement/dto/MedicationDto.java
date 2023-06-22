package com.akinnova.hospitalManagement.dto;


import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Builder
public class MedicationDto {
    private Long medicationId;
    //private String medicationName; // The name or generic name of the medication.
    private String medicineName; //The name of drug given, if applicable
    private String brandName; // The brand name, if applicable, of the medication.
    private String dosageStrength; // The strength or concentration of the medication (e.g., 500 mg, 10 mg/ml).
    private String dosageForm;  //The form in which the medication is available (e.g., Tablet, Capsule, Liquid)
    private String usageInstructions; // Instructions for how the medication should be used or taken.
    private LocalDateTime suppliedDate;
    private Date expirationDate; //The expiration date or shelf life of the medication
    private String manufacturer; //The name of the manufacturer or pharmaceutical company.
    private String nafdacNumber; // The unique identifier assigned to the medication by the FDA.
    private BigDecimal cost;  //The cost or price of the medication.
    private String Availability; // Information on the availability
    private String createdBy;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    private String modifiedBy;
    @UpdateTimestamp
    private LocalDateTime dateModified;

}
