package com.wellsfargo.batch5.pms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CompanyDetails")
@Inheritance(strategy=InheritanceType.JOINED)
public class CompanyDetailsEntity {


	
@Id
@GeneratedValue
@Column(name="company_id",nullable=true)
private Integer companyID;


@Column(name="company_code")
	private Integer companyCode;

@Column(name="company_ipo")
	private String companyIPO;

@Column(name="company_name")
	private String companyName;

@Column(name="company_sector")
	private String companySector;

@Column(name="company_operations")
	private String companyOperations;

@Column(name="share_count")
	private Integer ShareCount;

@Column(name="open_shareprice")
	private Integer OpenSharePrice;

@Column(name="sector")
private Integer sector;

@Column(name="currency")
private Integer currency;

@Column(name="turnover")
private Integer turnover;

@Column(name="stock_exchange")
private Integer stockExchange;


public Integer getSector() {
	return sector;
}

public void setSector(Integer sector) {
	this.sector = sector;
}

public Integer getCurrency() {
	return currency;
}

public void setCurrency(Integer currency) {
	this.currency = currency;
}

public Integer getTurnover() {
	return turnover;
}

public void setTurnover(Integer turnover) {
	this.turnover = turnover;
}

public CompanyDetailsEntity(Integer companyID, Integer companyCode, String companyIPO, String companyName,
		String companySector, String companyOperations, Integer shareCount, Integer openSharePrice, Integer sector,
		Integer currency, Integer turnover, Integer stockExchange) {
	super();
	this.companyID = companyID;
	this.companyCode = companyCode;
	this.companyIPO = companyIPO;
	this.companyName = companyName;
	this.companySector = companySector;
	this.companyOperations = companyOperations;
	ShareCount = shareCount;
	OpenSharePrice = openSharePrice;
	this.sector = sector;
	this.currency = currency;
	this.turnover = turnover;
	this.stockExchange = stockExchange;
}

public CompanyDetailsEntity(Integer companyCode2) {
	this.companyCode=companyCode2;
}






}