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
	

	@Id
 /*   @Column(length=5, nullable=false,name="company_code")
	@ColumnDefault("20000")
	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Long CompanyCode;


@Column(name="company_name")
	private String CompanyName;

@Column(name="company_sector")
	private String CompanySector;

@Column(name="company_operations")
	private String CompanyOperations;

@Column(name="share_count")
	private Integer ShareCount;

@Column(name="open_shareprice")
	private Integer OpenSharePrice;


@Column(name="trun_over")
private Integer TrunOver;

@OneToMany(mappedBy="company")
private List<StockPriceEntity> stocks;

@Override
public String toString() {
	return "CompanyDetails [CompanyCode=" + CompanyCode + ",  CompanyName=" + CompanyName
			+ ", CompanySector=" + CompanySector + ", CompanyOperations=" + CompanyOperations + ", ShareCount="
			+ ShareCount + ", OpenSharePrice=" + OpenSharePrice + ", TrunOver=" + TrunOver + "]";
}

public Long getCompanyCode() {
	return CompanyCode;
}

public void setCompanyCode(Long  companyCode) {
	CompanyCode = companyCode;
}



public String getCompanyName() {
	return CompanyName;
}

public void setCompanyName(String companyName) {
	CompanyName = companyName;
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

public Integer getTrunOver() {
	return TrunOver;
}

public void setTrunOver(Integer trunOver) {
	TrunOver = trunOver;
}

public CompanyDetailsEntity(Long companyCode, String companyIPO, String companyName, String companySector,
		String companyOperations, Integer shareCount, Integer openSharePrice, Integer trunOver) {
	super();
	CompanyCode = companyCode;
	
	CompanyName = companyName;
	CompanySector = companySector;
	CompanyOperations = companyOperations;
	ShareCount = shareCount;
	OpenSharePrice = openSharePrice;
	TrunOver = trunOver;
}

public CompanyDetailsEntity() {

	// TODO Auto-generated constructor stub
}


}
