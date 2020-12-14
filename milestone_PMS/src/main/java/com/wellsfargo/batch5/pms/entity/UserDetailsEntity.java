package com.wellsfargo.batch5.pms.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
@Inheritance(strategy=InheritanceType.JOINED)
public class UserDetailsEntity {		
	
	@Id
	@GeneratedValue
	@Column(name = "user_id",nullable=true)
	private Integer userId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="acno")
	private PortfolioWalletEntity salAccount;
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private Set<UserTransactionEntity> userTransactionEntity;	
	
	@Column(name = "bank_account")
	private String BankAccount;
	
	
	@Column(name = "pan_no",nullable=true)
	private String userpan;
	
	@Column(name = "first_name",nullable=false)
	private String firstname;
	
	@Column(name = "last_name",nullable=false)
	private String lastName;

	@Column(name = "user_name",nullable=false)
	private String userName;
	
	@Column(name = "password",nullable=true)
	private String password;
	
	@Column(name = "dob",nullable=false)																																																
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

	public UserDetailsEntity(Integer userId, PortfolioWalletEntity salAccount, String bankAccount, String userpan,
			String firstname, String lastName, String userName, String password, String dob, String usermobilenumber,
			String address, Integer bonus, String registereddate, String role) {
		super();
		this.userId = userId;
		this.salAccount = salAccount;
		BankAccount = bankAccount;
		this.userpan = userpan;
		this.firstname = firstname;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.dob = dob;
		this.usermobilenumber = usermobilenumber;
		this.address = address;
		this.bonus = bonus;
		this.registereddate = registereddate;
		this.role = role;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public PortfolioWalletEntity getSalAccount() {
		return salAccount;
	}

	public void setSalAccount(PortfolioWalletEntity salAccount) {
		this.salAccount = salAccount;
	}

	public String getBankAccount() {
		return BankAccount;
	}

	public void setBankAccount(String bankAccount) {
		BankAccount = bankAccount;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getBonus() {
		return bonus;
	}

	public void setBonus(Integer bonus) {
		this.bonus = bonus;
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
	
	
}
