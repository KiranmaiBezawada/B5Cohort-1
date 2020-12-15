package com.wellsfargo.batch5.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commodities")
public class CommoditiesEntity {
	
	@Id
	@Column(name="commodity_id")
	private Long CommodityID;
	
	@Column(name="commodity_type")
	private String CommodityType;
	
	@Column(name="commodity_price")
	private Integer CommodityPrice;
	
	@Column(name="date")
	private String date;
	

	public CommoditiesEntity() {
		
		// TODO Auto-generated constructor stub
	}


	public CommoditiesEntity(Long commodityID, String commodityType, Integer commodityPrice, String date) {
		super();
		CommodityID = commodityID;
		CommodityType = commodityType;
		CommodityPrice = commodityPrice;
		this.date = date;
	}


	public Long getCommodityID() {
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
