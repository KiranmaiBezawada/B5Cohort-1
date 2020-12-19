package com.wellsfargo.batch5.pms.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "userdetails")
public class UserDetailsEntity {
	
	@Id
    @Column(length=5, nullable=false)
	@ColumnDefault("10000")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name = "pan_no")
	private String userpan;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "gender")
	private String gender;
	
	@Column(name = "password")
	private String password;
		
	@Column(name = "dob")																																																
	private String dob;
	
	@Column(name = "user_mobile")
	private String usermobilenumber;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "bonus")
	private Integer bonus;

	@Column(name = "registered_date")																																																
	private String registereddate;
	
	@Column(name = "role")
	private String role;
	
	
	public UserDetailsEntity(Long userId, String userpan, String firstname, String lastName, String gender,
			String password, String dob, String usermobilenumber, String address, Integer bonus, String registereddate,
			String role) {
		super();
		this.userId = userId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegistereddate() {
		return registereddate;
	}

	public void setRegistereddate(String registereddate) {
		this.registereddate = registereddate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserDetailsEntity() {
		
	}


	public String getUserpan() {
		return userpan;
	}
	
	public void setUserpan(String userpan) {
		this.userpan = userpan;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
