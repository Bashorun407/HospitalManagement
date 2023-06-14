package com.akinnova.hospitalManagement.repository;

import com.akinnova.hospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Boolean exitsByRegistrationNumber(String registrationNumber);
    Boolean existsByContactNumber(String contactNumber);

    Optional<Patient> findById(Long patientId);
    Optional<Patient> findByRegistrationNumber(String registrationNumber);
    Optional<Patient> findByContactNumber(String contactNumber);
    Optional<Patient> findByEmail(String email);
    Optional<List<Patient>> findByAddress(String address);
    Optional<List<Patient>> findByLastName(String lastName);
    Optional<List<Patient>> findByFirstName(String firstName);
    Optional<List<Patient>> findAllPatient();


}
