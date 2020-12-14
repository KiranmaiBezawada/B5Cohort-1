package com.wellsfargo.batch5.pms.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class UserPortfolioModel extends UserDetailsModel {
	@NotNull(message=" CompanyCode is Mandate")
	private String CompanyCode;
	
	
	@NotNull(message=" SharesBought is Mandate")
	private Integer SharesBought;
	
	@NotNull(message=" EachShareCost is Mandate")
	private Integer EachShareCost;
	
	@NotNull(message=" CurrencyChoosen is Mandate")
	private String CurrencyChoosen;
	
	@NotNull(message=" SharesSell is Mandate")	
	private Integer SharesSell;
	
	public UserPortfolioModel() {
	
		
	}

	public UserPortfolioModel(String companyCode, Integer sharesBought, Integer eachShareCost, String currencyChoosen,
			Integer sharesSell) {
		super();
		CompanyCode = companyCode;
		SharesBought = sharesBought;
		EachShareCost = eachShareCost;
		CurrencyChoosen = currencyChoosen;
		SharesSell = sharesSell;
	}

	public String getCompanyCode() {
		return CompanyCode;
	}

	public void setCompanyCode(String companyCode) {
		CompanyCode = companyCode;
	}

	public Integer getSharesBought() {
		return SharesBought;
	}

	public void setSharesBought(Integer sharesBought) {
		SharesBought = sharesBought;
	}

	public Integer getEachShareCost() {
		return EachShareCost;
	}

	public void setEachShareCost(Integer eachShareCost) {
		EachShareCost = eachShareCost;
	}

	public String getCurrencyChoosen() {
		return CurrencyChoosen;
	}

	public void setCurrencyChoosen(String currencyChoosen) {
		CurrencyChoosen = currencyChoosen;
	}

	public Integer getSharesSell() {
		return SharesSell;
	}

	public void setSharesSell(Integer sharesSell) {
		SharesSell = sharesSell;
	}
    

}
