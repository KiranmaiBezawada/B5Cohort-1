package com.wellsfargo.pms.model;

import java.util.List;

public class CompanyDetails {
	private List ListedCompanyIPO;
	private Integer CompanyCode;
	private String CompanyTitle;
	public CompanyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String Operations;
	private long ShareCount; 
	private Integer OpenSharePrice;
	private String Sector;
	private long Turnover;
	public CompanyDetails(List listedCompanyIPO, Integer companyCode, String companyTitle, String operations,
			long shareCount, Integer openSharePrice, String sector, long turnover) {
		super();
		
	}
	public List getListedCompanyIPO() {
		return ListedCompanyIPO;
	}
	public void setListedCompanyIPO(List listedCompanyIPO) {
		ListedCompanyIPO = listedCompanyIPO;
	}
	public Integer getCompanyCode() {
		return CompanyCode;
	}
	public void setCompanyCode(Integer companyCode) {
		CompanyCode = companyCode;
	}
	public String getCompanyTitle() {
		return CompanyTitle;
	}
	public void setCompanyTitle(String companyTitle) {
		CompanyTitle = companyTitle;
	}
	public String getOperations() {
		return Operations;
	}
	public void setOperations(String operations) {
		Operations = operations;
	}
	public long getShareCount() {
		return ShareCount;
	}
	public void setShareCount(long shareCount) {
		ShareCount = shareCount;
	}
	public Integer getOpenSharePrice() {
		return OpenSharePrice;
	}
	public void setOpenSharePrice(Integer openSharePrice) {
		OpenSharePrice = openSharePrice;
	}
	public String getSector() {
		return Sector;
	}
	public void setSector(String sector) {
		Sector = sector;
	}
	public long getTurnover() {
		return Turnover;
	}
	public void setTurnover(long turnover) {
		Turnover = turnover;
	}
	

}
