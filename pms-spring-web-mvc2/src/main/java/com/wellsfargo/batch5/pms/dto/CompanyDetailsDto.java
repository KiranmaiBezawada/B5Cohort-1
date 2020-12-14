package com.wellsfargo.batch5.pms.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CompanyDetailsDto {

	private Long CompanyCode;
	
	
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
	
	
	
	
	
	
	public CompanyDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CompanyDetailsDto(Long companyCode, String companyTitle, String companySector,
			String companyOperations, Integer shareCount, Integer openSharePrice, Integer turnOver,
			double currentprice) {
		super();
		CompanyCode = companyCode;
		
		CompanyTitle = companyTitle;
		CompanySector = companySector;
		CompanyOperations = companyOperations;
		ShareCount = shareCount;
		OpenSharePrice = openSharePrice;
		TurnOver = turnOver;
		
		
	}


	public Long getCompanyCode() {
		return CompanyCode;
	}


	public void setCompanyCode(Long companyCode) {
		CompanyCode = companyCode;
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


	


	

	
	
}
