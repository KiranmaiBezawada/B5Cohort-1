package com.wellsfargo.pms.model;

public class PortfolioDashdboard {
	private long purchasequantity;
	private long sellquantity;
	private long buyquantity;
	private Double amountinvested;
	private Double amountearned;
	private String recentlyviewcompany;
	public long getPurchasequantity() {
		return purchasequantity;
	}
	public void setPurchasequantity(long purchasequantity) {
		this.purchasequantity = purchasequantity;
	}
	public long getSellquantity() {
		return sellquantity;
	}
	public void setSellquantity(long sellquantity) {
		this.sellquantity = sellquantity;
	}
	public long getBuyquantity() {
		return buyquantity;
	}
	public void setBuyquantity(long buyquantity) {
		this.buyquantity = buyquantity;
	}
	public Double getAmountinvested() {
		return amountinvested;
	}
	public void setAmountinvested(Double amountinvested) {
		this.amountinvested = amountinvested;
	}
	public Double getAmountearned() {
		return amountearned;
	}
	public void setAmountearned(Double amountearned) {
		this.amountearned = amountearned;
	}
	public String getRecentlyviewcompany() {
		return recentlyviewcompany;
	}
	public void setRecentlyviewcompany(String recentlyviewcompany) {
		this.recentlyviewcompany = recentlyviewcompany;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public PortfolioDashdboard(long purchasequantity, long sellquantity, long buyquantity, Double amountinvested,
			Double amountearned, String recentlyviewcompany, String currency) {
		super();
		this.purchasequantity = purchasequantity;
		this.sellquantity = sellquantity;
		this.buyquantity = buyquantity;
		this.amountinvested = amountinvested;
		this.amountearned = amountearned;
		this.recentlyviewcompany = recentlyviewcompany;
		this.currency = currency;
	}
	public PortfolioDashdboard() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String currency;
	

}
