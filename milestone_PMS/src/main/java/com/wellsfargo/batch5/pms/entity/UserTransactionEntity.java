package com.wellsfargo.batch5.pms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="userTransactions")
@Inheritance(strategy=InheritanceType.JOINED)
public class UserTransactionEntity implements Comparable<UserTransactionEntity> {
	@Id
	@GeneratedValue
	@Column(name="transaction_id")
	private Integer transactionId;


	@Column(name="company_code")
	private Integer CompanyCode;	

	
	@Column(name="buy_date")
	private Date buyDate;
	
	@Column(name="sell_date")
	private Date sellDate;
	
	
	@Column(name="purchase_price")
	private Integer purchasePrice;
	
	@Column(name="sell_price")
	private Integer sellPrice;
	
	@Column(name="currency_choosen")
	private String CurrencyChoosen;
		
	@Column(name="number_of_shares")
	private Integer numberofShares;
	
	@Column(name="operation")
	private String operation;
	
	@Column(name="brokerage_amount")
	private Integer brokerageAmount;
	
 
	@ManyToOne
	@JoinColumn(name="uid")
	private UserDetailsEntity user;


	public Integer getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getCompanyCode() {
		return CompanyCode;
	}


	public void setCompanyCode(Integer companyCode) {
		CompanyCode = companyCode;
	}


	public Date getBuyDate() {
		return buyDate;
	}


	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}


	public Date getSellDate() {
		return sellDate;
	}


	public void setSellDate(Date sellDate) {
		this.sellDate = sellDate;
	}


	public Integer getPurchasePrice() {
		return purchasePrice;
	}


	public void setPurchasePrice(Integer purchasePrice) {
		this.purchasePrice = purchasePrice;
	}


	public Integer getSellPrice() {
		return sellPrice;
	}


	public void setSellPrice(Integer sellPrice) {
		this.sellPrice = sellPrice;
	}


	public String getCurrencyChoosen() {
		return CurrencyChoosen;
	}


	public void setCurrencyChoosen(String currencyChoosen) {
		CurrencyChoosen = currencyChoosen;
	}


	public Integer getNumberofShares() {
		return numberofShares;
	}


	public void setNumberofShares(Integer numberofShares) {
		this.numberofShares = numberofShares;
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}


	public Integer getBrokerageAmount() {
		return brokerageAmount;
	}


	public void setBrokerageAmount(Integer brokerageAmount) {
		this.brokerageAmount = brokerageAmount;
	}


	public UserDetailsEntity getUserDetailsEntity() {
		return user;
	}


	public void setUserDetailsEntity(UserDetailsEntity userDetailsEntity) {
		this.user = userDetailsEntity;
	}


	@Override
	public int compareTo(UserTransactionEntity o) {
		
		return this.transactionId.compareTo(o.transactionId);
	}
	
	@Override
	public int hashCode() {	
		return Objects.hashCode(transactionId);
	}
	
	@Override
	public boolean equals(Object obj) {	
		return Objects.equals(this, obj);
	}
	
	
}
