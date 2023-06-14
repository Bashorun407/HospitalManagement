package com.akinnova.hospitalManagement.entity;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity(name = "transaction_table")
@Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId; //A unique identifier for the transaction.
    private Long medicationId; //The type of medication the patient received
    @CreationTimestamp
    private LocalDateTime dateTime;  //The date when the transaction occurred.
    private String description; //A description or brief explanation of the transaction.
    private BigDecimal amount; // The monetary amount or value of the transaction.
    private String modeOfPayment; // The method used for payment (e.g., Cash, Credit Card, Insurance).
    private String invoiceNumber; // The unique number assigned to the transaction invoice or bill.
    @ManyToOne
    private Patient patient;  //Many transaction to one patient relationship
}
