package com.alpha.Hospital.Entity;

import java.util.List;

import jakarta.persistence.OneToMany;

public class Doctor {
	private int id;
	private String name;
	private String Specialization;
	
	
	@OneToMany
	List<Patient>plist;

}
