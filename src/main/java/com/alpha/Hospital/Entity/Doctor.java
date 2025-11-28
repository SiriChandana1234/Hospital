package com.alpha.Hospital.Entity;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
@Length(max=10,min=2)
	private String name;
	private String specialization;
	

	 @OneToMany
    
	List<Patient>plist;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		specialization = specialization;
	}


	public List<Patient> getPlist() {
		return plist;
	}


	public void setPlist(List<Patient> plist) {
		this.plist = plist;
	}



	public Doctor( String name, String specialization, List<Patient> plist) {
		super();
		this.name = name;
	this.specialization = specialization;
		this.plist = plist;
	}


	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
