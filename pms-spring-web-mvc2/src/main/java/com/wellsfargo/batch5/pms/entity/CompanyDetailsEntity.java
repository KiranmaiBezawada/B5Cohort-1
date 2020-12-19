package com.wellsfargo.batch5.pms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="CompanyDetails")
public class CompanyDetailsEntity {
	
	//commented
	/*//one use many companies relation (user to many companies)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "companies")
	private UserDetailsEntity user;	*/
	

	
 /*   @Column(length=5, nullable=false,name="company_code")
	@ColumnDefault("20000")
	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	@Id
    private Long companyCode;


@Column(name="company_name")
	private String companyTitle;

@Column(name="company_sector")
	private String companySector;

@Column(name="company_operations")
	private String companyOperations;

@Column(name="share_count")
	private Integer shareCount;

@Column(name="open_shareprice")
	private Integer penSharePrice;


@Column(name="trun_over")
private Integer trunOver;

@OneToMany(mappedBy="company")
private List<StockPriceEntity> stocks;



public CompanyDetailsEntity(Long companyCode, String companyTitle, String companySector, String companyOperations,
		Integer shareCount, Integer penSharePrice, Integer trunOver, List<StockPriceEntity> stocks) {
	super();
	companyCode = companyCode;
	this.companyTitle = companyTitle;
	this.companySector = companySector;
	this.companyOperations = companyOperations;
	this.shareCount = shareCount;
	this.penSharePrice = penSharePrice;
	this.trunOver = trunOver;
	this.stocks = stocks;
}



public Long getCompanyCode() {
	return companyCode;
}



public void setCompanyCode(Long companyCode) {
	companyCode = companyCode;
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



public Integer getPenSharePrice() {
	return penSharePrice;
}



public void setPenSharePrice(Integer penSharePrice) {
	this.penSharePrice = penSharePrice;
}



public Integer getTrunOver() {
	return trunOver;
}



public void setTrunOver(Integer trunOver) {
	this.trunOver = trunOver;
}



public List<StockPriceEntity> getStocks() {
	return stocks;
}



public void setStocks(List<StockPriceEntity> stocks) {
	this.stocks = stocks;
}



public CompanyDetailsEntity() {

	// TODO Auto-generated constructor stub
}


}
