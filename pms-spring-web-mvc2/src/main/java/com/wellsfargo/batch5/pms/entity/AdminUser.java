package com.wellsfargo.batch5.pms.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="admin_users")
@Inheritance(strategy=InheritanceType.JOINED)
public class AdminUser {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private Integer adminUserId;
	
	@Column(name="unm",nullable=true,unique=true)
	private String userName;
	
	@Column(name="pwd",nullable=true)
	private String password;
	
	@Column(name="role",nullable=true)
	private String role;
	
	public AdminUser() {
		
	}

	public AdminUser(Integer adminUserId, String userName, String password,String role) {
		super();
		this.adminUserId = adminUserId;
		this.userName = userName;
		this.password = password;
		this.role=role;
	}

	public Integer getLibUserId() {
		return adminUserId;
	}

	public void setLibUserId(Integer libUserId) {
		this.adminUserId = libUserId;
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

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "AdminUser [libUserId=" + adminUserId + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
}
