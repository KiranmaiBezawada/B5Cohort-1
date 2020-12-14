package com.wellsfargo.batch5.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="stockprice")
public class StockPriceEntity extends CompanyDetailsEntity {
	
	

	@Id
	@GeneratedValue
	@Column(name="stock_id",nullable=true)
	private Integer stockId;
	
	@Column(name="stock_exchange")
	private String stockExchange;
	
	@Column(name="current_price")
	private Integer currentPrice;
	
	@Column(name="stock_price_date")
	private String dateoftheStockPrice;
	
	@Column(name="stock_price_time")
	private String StockPriceatSpecificTime;

	public StockPriceEntity(Integer companyCode, Integer stockId,Integer currentPrice,String dateoftheStockPrice,String StockPriceatSpecificTime) {
		super(companyCode);
		this.currentPrice=currentPrice;
		this.dateoftheStockPrice=dateoftheStockPrice;
		this.StockPriceatSpecificTime=StockPriceatSpecificTime;
		this.stockId=stockId;
	
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public Integer getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Integer currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getDateoftheStockPrice() {
		return dateoftheStockPrice;
	}

	public void setDateoftheStockPrice(String dateoftheStockPrice) {
		this.dateoftheStockPrice = dateoftheStockPrice;
	}

	public String getStockPriceatSpecificTime() {
		return StockPriceatSpecificTime;
	}

	public void setStockPriceatSpecificTime(String stockPriceatSpecificTime) {
		StockPriceatSpecificTime = stockPriceatSpecificTime;
	}
	
	
	
	
	
}
