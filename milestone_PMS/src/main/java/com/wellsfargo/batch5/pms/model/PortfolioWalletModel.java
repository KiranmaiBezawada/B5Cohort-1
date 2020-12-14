package com.wellsfargo.batch5.pms.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class PortfolioWalletModel {
	
	@NotNull(message=" BankAccount is Mandate")
	@Min(value=1,message="BankAccount cannot be nagitive or zero")
	private String BankAccount;
	

	@NotNull(message=" IFSCCode is Mandate")
	@Min(value=1,message="IFSCCode cannot be nagitive or zero")
	private String IFSCCode;
	
	@NotNull(message=" AmountDeposited is Mandate")
	private Integer AmountDeposited;
	
	@PastOrPresent(message="DepositedDate cannot be future date")
	@DateTimeFormat(iso=ISO.DATE)
	private Date DepositedDate;
	
	
	public PortfolioWalletModel() {
	}

	public String getBankAccount() {
		return BankAccount;
	}

	public void setBankAccount(String bankAccount) {
		BankAccount = bankAccount;
	}

	public String getIFSCCode() {
		return IFSCCode;
	}

	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}

	public Integer getAmountDeposited() {
		return AmountDeposited;
	}

	public void setAmountDeposited(Integer amountDeposited) {
		AmountDeposited = amountDeposited;
	}

	public Date getDepositedDate() {
		return DepositedDate;
	}

	public void setDepositedDate(Date depositedDate) {
		DepositedDate = depositedDate;
	}

	public PortfolioWalletModel(String bankAccount, String iFSCCode, Integer amountDeposited, Date depositedDate
			) {
		super();
		BankAccount = bankAccount;
		IFSCCode = iFSCCode;
		AmountDeposited = amountDeposited;
		DepositedDate = depositedDate;
		
	}

}
