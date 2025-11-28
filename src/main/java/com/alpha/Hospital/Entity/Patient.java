package com.alpha.Hospital.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

    @NotBlank(message = "Patient name cannot be blank")
	private String name;
    @Positive
    private int age;
	private String disease;
	private String bgroup;
	private int bp;
	private int sugarlevel;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getBgroup() {
		return bgroup;
	}
	public void setBgroup(String bgroup) {
		this.bgroup = bgroup;
	}
	public int getBp() {
		return bp;
	}
	public void setBp(int bp) {
		this.bp = bp;
	}
	public int getSugarlevel() {
		return sugarlevel;
	}
	public void setSugarlevel(int sugarlevel) {
		this.sugarlevel = sugarlevel;
	}
	public Patient(@NotBlank(message = "Patient name cannot be blank") String name, @Positive int age, String disease,
			String bgroup, int bp, int sugarlevel) {
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.bgroup = bgroup;
		this.bp = bp;
		this.sugarlevel = sugarlevel;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	
	