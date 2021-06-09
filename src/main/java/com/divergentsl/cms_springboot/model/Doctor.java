package com.divergentsl.cms_springboot.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	@Override
	public String toString() {
		return "Doctor [username=" + username + ", doctor_id=" + doctor_id + ", fees=" + fees + ", degree=" + degree
				+ ", specializatio=" + specializatio + ", prescription=" + prescription + ", password=" + password
				+ "]";
	}
	private String username;

	@Id
	private String doctor_id;
	
	private String fees;
	private String degree;
	private String specializatio;
	private String prescription;
	private String password;

	public Doctor(String username, String doctor_id, String fees, String degree, String specializatio,
			String prescription, String password) {
		super();
		this.username = username;
		this.doctor_id = doctor_id;
		this.fees = fees;
		this.degree = degree;
		this.specializatio = specializatio;
		this.prescription = prescription;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSpecializatio() {
		return specializatio;
	}
	public void setSpecializatio(String specializatio) {
		this.specializatio = specializatio;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
