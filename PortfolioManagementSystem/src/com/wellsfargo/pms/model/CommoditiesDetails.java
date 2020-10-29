package com.wellsfargo.pms.model;

public class CommoditiesDetails {
	private Double commodityprice;
	private Integer commodityid;
	private String  commoditytype;
	public Double getCommodityprice() {
		return commodityprice;
	}
	public void setCommodityprice(Double commodityprice) {
		this.commodityprice = commodityprice;
	}
	public Integer getCommodityid() {
		return commodityid;
	}
	public void setCommodityid(Integer commodityid) {
		this.commodityid = commodityid;
	}
	public String getCommoditytype() {
		return commoditytype;
	}
	public void setCommoditytype(String commoditytype) {
		this.commoditytype = commoditytype;
	}
	public CommoditiesDetails(Double commodityprice, Integer commodityid, String commoditytype) {
		super();
		this.commodityprice = commodityprice;
		this.commodityid = commodityid;
		this.commoditytype = commoditytype;
	}
	public CommoditiesDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
