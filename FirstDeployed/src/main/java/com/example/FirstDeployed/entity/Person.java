package com.example.FirstDeployed.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private LocalDate dob;
	private String email;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Long id, String name, LocalDate dob, String email, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.gender = gender;
	}
	public Person(String name, LocalDate dob, String email, Gender gender) {
		super();
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.gender = gender;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dob=" + dob + ", email=" + email + ", gender=" + gender + "]";
	}
	
	

}
