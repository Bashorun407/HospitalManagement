package com.akinnova.hospitalManagement.repository;

import com.akinnova.hospitalManagement.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Boolean existsByInvoiceNumber (String invoiceNumber);
    Boolean existsByMedicationId(Long medicationId);
    Boolean existsByPatientId(Long patientId);

    Optional<Transaction> findById(Long transactionId);
    Optional<Transaction> findByInvoiceNumber(String invoiceNumber);
    Optional<List<Transaction>> findByModeOfPayment(String modeOfPayment);
    Optional<List<Transaction>> findByPatientId(Long patientId);
    Optional<List<Transaction>> findByMedicationId(Long medicationId);
    Optional<List<Transaction>> findAllTransaction();

}
