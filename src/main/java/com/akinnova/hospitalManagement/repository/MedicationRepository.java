package com.akinnova.hospitalManagement.repository;

import com.akinnova.hospitalManagement.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface MedicationRepository extends JpaRepository<Medication, Long> {

    Boolean existsByNafdacNumber(String nafdacNumber);
    Optional<Medication> findByMedicineName(String medicineName);
    Optional<Medication> findByNafdacNumber(String nafdacNumber);
    Optional<List<Medication>> findByBrandName(String brandName);
    Optional<List<Medication>> findByManufacturer(String manufacturer);
}
