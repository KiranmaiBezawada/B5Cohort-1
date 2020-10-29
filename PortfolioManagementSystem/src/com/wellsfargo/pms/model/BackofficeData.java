package com.wellsfargo.pms.model;

public class BackofficeData {
	
private String StockExchange;
private Double StockPrice;
public BackofficeData() {
	super();
	// TODO Auto-generated constructor stub
}
public BackofficeData(String stockExchange, Double stockPrice) {
	super();
	StockExchange = stockExchange;
	StockPrice = stockPrice;
}
public String getStockExchange() {
	return StockExchange;
}
public void setStockExchange(String stockExchange) {
	StockExchange = stockExchange;
}
public Double getStockPrice() {
	return StockPrice;
}
public void setStockPrice(Double stockPrice) {
	StockPrice = stockPrice;
}


}
