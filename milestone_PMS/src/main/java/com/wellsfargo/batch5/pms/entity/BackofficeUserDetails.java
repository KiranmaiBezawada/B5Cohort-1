package com.wellsfargo.batch5.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="backofficeuser")

public class BackofficeUserDetails extends UserDetailsEntity {

	@Id
	@GeneratedValue
	@Column(name="backofficeuser_id",nullable=true)
	private Integer backOfficeUserId;
	
	@Column(name="updated_date")
	private String updatedDate;	
	
	@Column(name="name")
	private Integer name;	

	CompanyDetailsEntity Companydetailsentity;

	public BackofficeUserDetails(Integer userId, PortfolioWalletEntity salAccount, String bankAccount, String userpan,
			String firstname, String lastName, String userName, String password, String dob, String usermobilenumber,
			String address, Integer bonus, String registereddate, String role, Integer backOfficeUserId,
			String updatedDate, Integer name, CompanyDetailsEntity companydetailsentity) {
		super(userId, salAccount, bankAccount, userpan, firstname, lastName, userName, password, dob, usermobilenumber,
				address, bonus, registereddate, role);
		this.backOfficeUserId = backOfficeUserId;
		this.updatedDate = updatedDate;
		this.name = name;
		Companydetailsentity = companydetailsentity;
	}
	
	
	
}
