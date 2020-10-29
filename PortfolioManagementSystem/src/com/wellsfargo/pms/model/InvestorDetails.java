package com.wellsfargo.pms.model;

import java.util.Date;

public class InvestorDetails {
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String pan;
	private Date dob;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public InvestorDetails(String username, String password, String firstname, String lastname, String pan, Date dob) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.pan = pan;
		this.dob = dob;
	}
	public InvestorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
