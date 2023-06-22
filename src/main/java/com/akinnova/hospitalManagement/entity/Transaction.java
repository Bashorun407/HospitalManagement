package com.akinnova.hospitalManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "transaction_table", uniqueConstraints = {
        @UniqueConstraint(columnNames = "invoiceNumber")
})

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId; //A unique identifier for the transaction.
    private Long staffId; //The identifier or reference to the staff associated with the transaction
    private Long patientId;  //The identifier or reference to the patient associated with the transaction.
    private Long medicationId; //The type of medication the patient received
    private String description; //A description or brief explanation of the transaction.
    private BigDecimal amount; // The monetary amount or value of the transaction.
    private String modeOfPayment; // The method used for payment (e.g., Cash, Credit Card, Insurance).
    private String invoiceNumber; // The unique number assigned to the transaction invoice or bill.
    private String createdBy;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    private String modifiedBy;
    @UpdateTimestamp
    private LocalDateTime dateModified;

}
