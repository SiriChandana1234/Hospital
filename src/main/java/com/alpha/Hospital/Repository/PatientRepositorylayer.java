package com.alpha.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.Hospital.Entity.Patient;

public interface PatientRepositorylayer extends JpaRepository<Patient, Integer> {
	
	

}
