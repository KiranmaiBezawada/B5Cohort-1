package com.wellsfargo.batch5.pms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.wellsfargo.batch5.pms.entity.CompanyDetailsEntity;


public class StockPriceDto{
	
	
	private Long stockId;
	
	@NotNull(message="Stock Price is mandatory")	
	private String StockExchange;
	
	@NotNull(message="Current Price is mandatory")
	private Integer CurrentPrice;
	
	@NotNull(message="Date of Stock Price is mandatory")
	private String DateoftheStockPrice;
	
	@NotNull(message="Time of Stock Price is mandatory")
	private String StockPriceatSpecificTime;
	
	
	private CompanyDetailsEntity company;
	
	public StockPriceDto() {
		
	}

	

	public StockPriceDto(Long companyCode, String companyIPO, String companyName, String companySector,
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
