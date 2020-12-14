package com.wellsfargo.batch5.pms.model;


import java.util.Date;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class UserDetailsModel {
	
	@NotNull(message="User Pan number is mandate")
	private String userpan;
	
	@NotNull(message="User UserName is mandate")
	private String username;
	
	@NotNull(message="User password is mandate")	
	@Size(min=8,max=15,message ="Password is mandate")
	private String password;
	
	@NotNull(message="Please enter FirstName")
	private String firstname;
	
	@NotNull(message="lastName is mandate")
	private String lastName;
	
	@NotNull(message="gender is mandate")
	private String gender;
	
	
	
	@DateTimeFormat(iso=ISO.DATE)
	private Date dob;	
	private String usermobilenumber;
	private String address;
	
	private Integer bonus;
	@PastOrPresent(message="registereddate cannot be future date")
	
	@DateTimeFormat(iso=ISO.DATE)
	private Date registereddate;
	private String role;
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegistereddate() {
		return registereddate;
	}

	public void setRegistereddate(Date registereddate) {
		this.registereddate = registereddate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserDetailsModel() {
		
	}

	public UserDetailsModel(String userpan, String firstname, String lastName, String gender, String password, Date dob,
			String usermobilenumber, String address, Integer bonus, Date registereddate, String role) {
		super();
		this.userpan = userpan;
		this.firstname = firstname;
		this.lastName = lastName;
		this.gender = gender;
		this.password = password;
		this.dob = dob;
		this.usermobilenumber = usermobilenumber;
		this.address = address;
		this.bonus = bonus;
		this.registereddate = registereddate;
		this.role = role;
	}

	

	public String getUserpan() {
		return userpan;
	}
	
	public void setUserpan( String Userpan) {
		this.userpan = Userpan;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getUsermobilenumber() {
		return usermobilenumber;
	}

	public void setUsermobilenumber(String usermobilenumber) {
		this.usermobilenumber = usermobilenumber;
	}

	public Integer getBonus() {
		return bonus;
	}

	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}

	
	

}
