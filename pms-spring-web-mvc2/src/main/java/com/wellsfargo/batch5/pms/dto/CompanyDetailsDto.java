package com.wellsfargo.batch5.pms.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CompanyDetailsDto {

	private Long companyCode;
	
	@NotNull(message=" CompanyTitle is Mandate")
	@NotBlank(message=" CompanyTitle is Mandate")
	private String companyTitle;
	
	@NotNull(message=" CompanySector is Mandate")
	private String companySector;
	
	@NotNull(message=" CompanyOperations is Mandate")
	private String companyOperations;
	
	@NotNull(message=" ShareCount is Mandate")
	@Min(value=1,message="ShareCount cannot be nagitive or zero")
	private Integer shareCount;
	
	@NotNull(message=" OpenSharePrice is Mandate")
	@Min(value=1,message="OpenSharePrice cannot be nagitive or zero")
	private Integer openSharePrice;
	
	@NotNull(message=" TurnOver is Mandate")
	@Min(value=1,message="TurnOver cannot be nagitive or zero")
	private Integer turnOver;
	
	
	
	
	
	
	public CompanyDetailsDto() {

	}






	public CompanyDetailsDto(Long companyCode,
			@NotNull(message = " CompanyTitle is Mandate") @NotBlank(message = " CompanyTitle is Mandate") String companyTitle,
			@NotNull(message = " CompanySector is Mandate") String companySector,
			@NotNull(message = " CompanyOperations is Mandate") String companyOperations,
			@NotNull(message = " ShareCount is Mandate") @Min(value = 1, message = "ShareCount cannot be nagitive or zero") Integer shareCount,
			@NotNull(message = " OpenSharePrice is Mandate") @Min(value = 1, message = "OpenSharePrice cannot be nagitive or zero") Integer openSharePrice,
			@NotNull(message = " TurnOver is Mandate") @Min(value = 1, message = "TurnOver cannot be nagitive or zero") Integer turnOver) {
		super();
		this.companyCode = companyCode;
		this.companyTitle = companyTitle;
		this.companySector = companySector;
		this.companyOperations = companyOperations;
		this.shareCount = shareCount;
		this.openSharePrice = openSharePrice;
		this.turnOver = turnOver;
	}






	public Long getCompanyCode() {
		return companyCode;
	}






	public void setCompanyCode(Long companyCode) {
		this.companyCode = companyCode;
	}






	public String getCompanyTitle() {
		return companyTitle;
	}






	public void setCompanyTitle(String companyTitle) {
		this.companyTitle = companyTitle;
	}






	public String getCompanySector() {
		return companySector;
	}






	public void setCompanySector(String companySector) {
		this.companySector = companySector;
	}






	public String getCompanyOperations() {
		return companyOperations;
	}






	public void setCompanyOperations(String companyOperations) {
		this.companyOperations = companyOperations;
	}






	public Integer getShareCount() {
		return shareCount;
	}






	public void setShareCount(Integer shareCount) {
		this.shareCount = shareCount;
	}






	public Integer getOpenSharePrice() {
		return openSharePrice;
	}






	public void setOpenSharePrice(Integer openSharePrice) {
		this.openSharePrice = openSharePrice;
	}






	public Integer getTurnOver() {
		return turnOver;
	}






	public void setTurnOver(Integer turnOver) {
		this.turnOver = turnOver;
	}
	
	
		
	
}
