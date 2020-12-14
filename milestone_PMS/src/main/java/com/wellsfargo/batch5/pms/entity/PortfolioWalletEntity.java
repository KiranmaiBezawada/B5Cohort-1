package com.wellsfargo.batch5.pms.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "portfolio_ wallet")
@Inheritance(strategy=InheritanceType.JOINED)
public class PortfolioWalletEntity {
	@Id
	@Column(name = "bank_account")
	private String bankAccount;

	@Column(name = "IFSC_Code")
	private String iFSCCode;

	@Column(name = "amount_deposited")
	private Integer amountDeposited;

	@Column(name = "deposited_date")
	private Date depositedDate;
	
	@OneToOne(mappedBy = "salAccount")
	private UserDetailsEntity accountHolder;
	
	public PortfolioWalletEntity() {
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		bankAccount = bankAccount;
	}

	public String getIFSCCode() {
		return iFSCCode;
	}

	public void setIFSCCode(String iFSCCode) {
		iFSCCode = iFSCCode;
	}

	public Integer getAmountDeposited() {
		return amountDeposited;
	}

	public void setAmountDeposited(Integer amountDeposited) {
		amountDeposited = amountDeposited;
	}

	public Date getDepositedDate() {
		return depositedDate;
	}

	public void setDepositedDate(Date depositedDate) {
		depositedDate = depositedDate;
	}

	public PortfolioWalletEntity(String bankAccount, String iFSCCode, Integer amountDeposited, Date depositedDate,
			UserDetailsEntity accountHolder) {
		super();
		this.bankAccount = bankAccount;
		this.iFSCCode = iFSCCode;
		this.amountDeposited = amountDeposited;
		this.depositedDate = depositedDate;
		this.accountHolder = accountHolder;
	}

	public String getiFSCCode() {
		return iFSCCode;
	}

	public void setiFSCCode(String iFSCCode) {
		this.iFSCCode = iFSCCode;
	}

	public UserDetailsEntity getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(UserDetailsEntity accountHolder) {
		this.accountHolder = accountHolder;
	}

	

}
