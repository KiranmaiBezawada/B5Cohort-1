package com.wellsfargo.batch5.pms.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class CommoditiesDto {
	
	@NotNull(message=" CommodityID is Mandate")
	@Min(value=1,message="CommodityID cannot be nagitive or zero")
	private Long CommodityID;
	
	@NotNull(message="Please select from dropdown")
	private String CommodityType;
	
	@NotNull(message="CommodityPrice is Mandate")
	@Min(value=1,message="CommodityPrice cannot be nagitive or zero")
	private Integer CommodityPrice;
	
	private String date;
	

	public CommoditiesDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CommoditiesDto(Long commodityID, String commodityType, Integer commodityPrice, String date) {
		
		super();
		CommodityID = commodityID;
		CommodityType = commodityType;
		CommodityPrice = commodityPrice;
		this.date = date;
	}


	public  Long getCommodityID() {
		return CommodityID;
	}


	public void setCommodityID(Long commodityID) {
		CommodityID = commodityID;
	}


	public String getCommodityType() {
		return CommodityType;
	}


	public void setCommodityType(String commodityType) {
		CommodityType = commodityType;
	}


	public Integer getCommodityPrice() {
		return CommodityPrice;
	}


	public void setCommodityPrice(Integer commodityPrice) {
		CommodityPrice = commodityPrice;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	

}
