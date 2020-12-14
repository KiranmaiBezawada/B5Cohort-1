package com.wellsfargo.batch5.pms.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Admin")
public class AdminEntity extends UserDetailsEntity{
	
	@Id
	@Column(name="admin_id")
	@GeneratedValue
	private Integer adminId;
	
	@Column(name="backofficeusername")
	private String bOUser;
	
	@Column(name="backofficeusername")
	private String bOpassword;
	
	@Column(name="created_date")
	private String createdDate;

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getbOUser() {
		return bOUser;
	}

	public void setbOUser(String bOUser) {
		this.bOUser = bOUser;
	}

	public String getbOpassword() {
		return bOpassword;
	}

	public void setbOpassword(String bOpassword) {
		this.bOpassword = bOpassword;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public AdminEntity(Integer userId, PortfolioWalletEntity salAccount, String bankAccount, String userpan,
			String firstname, String lastName, String userName, String password, String dob, String usermobilenumber,
			String address, Integer bonus, String registereddate, String role, Integer adminId, String bOUser,
			String bOpassword, String createdDate) {
		super(userId, salAccount, bankAccount, userpan, firstname, lastName, userName, password, dob, usermobilenumber,
				address, bonus, registereddate, role);
		this.adminId = adminId;
		this.bOUser = bOUser;
		this.bOpassword = bOpassword;
		this.createdDate = createdDate;
	}

	
	

}
