package com.wellsfargo.batch5.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="commodities")
public class CommoditiesEntity  extends CompanyDetailsEntity{	
	

	public CommoditiesEntity(Integer companyID,	Integer CommodityID,String CommodityType,Integer CommodityPrice ) {
		super(companyID);
		this.CommodityID=CommodityID;
		this.CommodityPrice=CommodityPrice;
		this.CommodityType=CommodityType;
	}

	public Integer getCommodityID() {
		return CommodityID;
	}

	public void setCommodityID(Integer commodityID) {
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

	@Id
	@GeneratedValue
	@Column(name="commodity_id",nullable=true)
	private Integer CommodityID;
	
	@Column(name="commodity_type",nullable=false)
	private String CommodityType;
	
	@Column(name="commodity_price",nullable=true)
	private Integer CommodityPrice;
	
	
	
	
}
