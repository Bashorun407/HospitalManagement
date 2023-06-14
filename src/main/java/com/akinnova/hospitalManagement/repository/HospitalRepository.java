package com.akinnova.hospitalManagement.repository;

import com.akinnova.hospitalManagement.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

    Boolean existsByRegistrationNumber(String registrationNumber);
    Boolean existsByContactNumber(String contactNumber);

    Optional<Hospital> findById(Long hospitalId);
    Optional<Hospital> findByHospitalName(String hospitalName);
    Optional<Hospital> findHByContactNumber(String contactNumber);
    Optional<Hospital> findByEmail(String email);
    Optional<Hospital> findByRegistrationNumber(String registrationNumber);
    Optional<Hospital> findByAddress(String address);
    Optional<List<Hospital>> findByCity(String city);
    Optional<List<Hospital>> findAllHospital();

}
