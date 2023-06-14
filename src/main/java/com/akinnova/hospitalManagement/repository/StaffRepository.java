package com.akinnova.hospitalManagement.repository;

import com.akinnova.hospitalManagement.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

    Boolean exitsByLicenseNumber(String registrationNumber);
    Boolean existsByContactNumber(String contactNumber);
    Optional<Staff> findById(Long staffId);
    Optional<Staff> findByLicenseNumber(String registrationNumber);
    Optional<Staff> findByContactNumber(String contactNumber);
    Optional<Staff> findByEmail(String email);
    Optional<List<Staff>> findByAddress(String address);
    Optional<List<Staff>> findByLastName(String lastName);
    Optional<List<Staff>> findByFirstName(String firstName);
    Optional<List<Staff>> findByJobTitle(String jobTitle);
    Optional<List<Staff>> findByDepartment(String department);
    Optional<List<Staff>> findAllStaff();
}
