package com.wellsfargo.batch5.pms.model;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class CommoditiesModel {
	
	@NotNull(message=" CommodityID is Mandate")
	@Min(value=1,message="CommodityID cannot be nagitive or zero")
	private String CommodityID;
	
	@NotNull(message="Please select from dropdown")
	private String CommodityType;
	
	@NotNull(message="CommodityPrice is Mandate")
	@Min(value=1,message="CommodityPrice cannot be nagitive or zero")
	private Integer CommodityPrice;		
	
	@Column(name="company_name")
	private Integer companyName;

}