package com.wellsfargo.batch5.pms.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CompanyDetailsModel {
	@NotNull(message=" CompanyCode is Mandate")
	@Min(value=1,message="CompanyCode cannot be nagitive or zero")
	private Integer CompanyCode;
	
	@NotNull(message=" CompanyIPO is Mandate")
	@Min(value=1,message="CompanyIPO cannot be nagitive or zero")
	private String CompanyIPO;
	
	@NotNull(message=" CompanyTitle is Mandate")
	@NotBlank(message=" CompanyTitle is Mandate")
	private String CompanyTitle;
	
	@NotNull(message=" CompanySector is Mandate")
	private String CompanySector;
	
	@NotNull(message=" CompanyOperations is Mandate")
	private String CompanyOperations;
	
	@NotNull(message=" ShareCount is Mandate")
	@Min(value=1,message="ShareCount cannot be nagitive or zero")
	private Integer ShareCount;
	
	@NotNull(message=" OpenSharePrice is Mandate")
	@Min(value=1,message="OpenSharePrice cannot be nagitive or zero")
	private Integer OpenSharePrice;
	
	@NotNull(message=" TurnOver is Mandate")
	@Min(value=1,message="TurnOver cannot be nagitive or zero")
	private Integer TurnOver;
	
	
	private double currency;
	
	@NotNull(message=" currentprice is Mandate")
	@Min(value=1,message="currentprice cannot be nagitive or zero")
	private double currentprice;
	
	public CompanyDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CompanyDetailsModel(Integer companyCode, String companyIPO, String companyTitle, String companySector,
			String companyOperations, Integer shareCount, Integer openSharePrice, Integer turnOver, double currency,
			double currentprice) {
		super();
		CompanyCode = companyCode;
		CompanyIPO = companyIPO;
		CompanyTitle = companyTitle;
		CompanySector = companySector;
		CompanyOperations = companyOperations;
		ShareCount = shareCount;
		OpenSharePrice = openSharePrice;
		TurnOver = turnOver;
		this.currency = currency;
		this.currentprice = currentprice;
	}


	public Integer getCompanyCode() {
		return CompanyCode;
	}


	public void setCompanyCode(Integer companyCode) {
		CompanyCode = companyCode;
	}


	public String getCompanyIPO() {
		return CompanyIPO;
	}


	public void setCompanyIPO(String companyIPO) {
		CompanyIPO = companyIPO;
	}


	public String getCompanyTitle() {
		return CompanyTitle;
	}


	public void setCompanyTitle(String companyTitle) {
		CompanyTitle = companyTitle;
	}


	public String getCompanySector() {
		return CompanySector;
	}


	public void setCompanySector(String companySector) {
		CompanySector = companySector;
	}


	public String getCompanyOperations() {
		return CompanyOperations;
	}


	public void setCompanyOperations(String companyOperations) {
		CompanyOperations = companyOperations;
	}


	public Integer getShareCount() {
		return ShareCount;
	}


	public void setShareCount(Integer shareCount) {
		ShareCount = shareCount;
	}


	public Integer getOpenSharePrice() {
		return OpenSharePrice;
	}


	public void setOpenSharePrice(Integer openSharePrice) {
		OpenSharePrice = openSharePrice;
	}


	public Integer getTurnOver() {
		return TurnOver;
	}


	public void setTurnOver(Integer turnOver) {
		TurnOver = turnOver;
	}


	public double getCurrency() {
		return currency;
	}


	public void setCurrency(double currency) {
		this.currency = currency;
	}


	public double getCurrentprice() {
		return currentprice;
	}


	public void setCurrentprice(double currentprice) {
		this.currentprice = currentprice;
	}

	
	
}
