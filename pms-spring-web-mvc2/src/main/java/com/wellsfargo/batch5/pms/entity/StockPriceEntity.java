package com.wellsfargo.batch5.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="stockprice")
public class StockPriceEntity{
	
	
	@Id
  /*  @Column(length=5, nullable=false,name="stockId")
	@ColumnDefault("30000")
	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	private Long stockId;
	
	@Column(name="stock_exchange")
	private String StockExchange;
	
	@Column(name="current_price")
	private Integer CurrentPrice;
	
	@Column(name="stock_price_date")
	private String DateoftheStockPrice;
	
	@Column(name="stock_price_time")
	private String StockPriceatSpecificTime;
	

		//foreign key
		@ManyToOne
		private CompanyDetailsEntity company;
	
	public StockPriceEntity() {
		
	}

	

	public StockPriceEntity(Long companyCode, String companyIPO, String companyName, String companySector,
			String companyOperations, Integer shareCount, Integer openSharePrice, Integer trunOver, Long stockId,
			String stockExchange, Integer currentPrice, String dateoftheStockPrice, String stockPriceatSpecificTime) {
		
		this.stockId = stockId;
		StockExchange = stockExchange;
		CurrentPrice = currentPrice;
		DateoftheStockPrice = dateoftheStockPrice;
		StockPriceatSpecificTime = stockPriceatSpecificTime;
	}



	public Long getStockId() {
		return stockId;
	}



	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}



	public String getStockExchange() {
		return StockExchange;
	}

	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}

	public Integer getCurrentPrice() {
		return CurrentPrice;
	}

	public void setCurrentPrice(Integer currentPrice) {
		CurrentPrice = currentPrice;
	}

	public String getDateoftheStockPrice() {
		return DateoftheStockPrice;
	}

	public void setDateoftheStockPrice(String dateoftheStockPrice) {
		DateoftheStockPrice = dateoftheStockPrice;
	}

	public String getStockPriceatSpecificTime() {
		return StockPriceatSpecificTime;
	}

	public void setStockPriceatSpecificTime(String stockPriceatSpecificTime) {
		StockPriceatSpecificTime = stockPriceatSpecificTime;
	}
	

}
