package com.wellsfargo.batch5.pms.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class StockPriceModel extends CompanyDetailsModel {
	@NotNull(message=" StockExchange is Mandate")
	private String StockExchange;
	
	@NotNull(message=" CurrentPrice is Mandate")
	@Min(value=1,message="CurrentPrice cannot be nagitive or zero")
	private Integer CurrentPrice;
	

	@PastOrPresent(message="DateoftheStockPrice cannot be future date")
	@DateTimeFormat(iso=ISO.DATE)
	private String DateoftheStockPrice;
	
	@NotNull(message=" StockPriceatSpecificTime is Mandate")
	private String StockPriceatSpecificTime;
	
	public StockPriceModel() {
		
	}

	public StockPriceModel(String stockExchange, Integer currentPrice, String dateoftheStockPrice,
			String stockPriceatSpecificTime) {
		super();
		StockExchange = stockExchange;
		CurrentPrice = currentPrice;
		DateoftheStockPrice = dateoftheStockPrice;
		StockPriceatSpecificTime = stockPriceatSpecificTime;
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
