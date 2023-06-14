package com.akinnova.hospitalManagement.dto;

import com.akinnova.hospitalManagement.dto.AbstractClass.BaseEntityDto;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@Builder
public class TransactionDto extends BaseEntityDto {
    private Long transactionId; //A unique identifier for the transaction.
    private Long PatientId;  //The identifier or reference to the patient associated with the transaction.
    private Long medicationId; //The type of medication the patient received
    private LocalDateTime dateTime;  //The date when the transaction occurred.
    private String description; //A description or brief explanation of the transaction.
    private BigDecimal amount; // The monetary amount or value of the transaction.
    private String modeOfPayment; // The method used for payment (e.g., Cash, Credit Card, Insurance).
    private String invoiceNumber; // The unique number assigned to the transaction invoice or bill.

}
