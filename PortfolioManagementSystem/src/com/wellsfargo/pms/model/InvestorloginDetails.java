package com.wellsfargo.pms.model;

import java.util.Date;

public class InvestorloginDetails {
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String pan;
	private Integer mobile;
	private String uid ;
	private String pwd;
	private Date dob;
	
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public InvestorloginDetails(Integer mobile, String uid, String pwd) {
		super();
		this.mobile = mobile;
		this.uid = uid;
		this.pwd = pwd;
	}
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
		return getDob();
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public InvestorloginDetails(String username, String password, String firstname, String lastname, String pan, Date dob) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.pan = pan;
		this.dob = dob;
	}
	public InvestorloginDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
