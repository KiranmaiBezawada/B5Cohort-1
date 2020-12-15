package com.wellsfargo.batch5.pms.util;

import java.util.Set;
import java.util.stream.Collectors;

import com.wellsfargo.batch5.pms.dto.CommoditiesDto;
import com.wellsfargo.batch5.pms.dto.CompanyDetailsDto;
import com.wellsfargo.batch5.pms.dto.StockPriceDto;
import com.wellsfargo.batch5.pms.dto.UserDetailsDto;
import com.wellsfargo.batch5.pms.entity.CommoditiesEntity;
import com.wellsfargo.batch5.pms.entity.CompanyDetailsEntity;
import com.wellsfargo.batch5.pms.entity.StockPriceEntity;
import com.wellsfargo.batch5.pms.entity.UserDetailsEntity;


public class EMParser {
	
	public static UserDetailsDto parse(UserDetailsEntity source) {
		UserDetailsDto target = new UserDetailsDto();
	    target.setUserId(source.getUserId());
		target.setAddress(source.getAddress());
		target.setBonus(source.getBonus());
		target.setFirstname(source.getFirstname());
		target.setLastName(source.getLastName());
		target.setDob(source.getDob());
		target.setGender(source.getGender());
		target.setRegistereddate(source.getRegistereddate());
		target.setRole(source.getRole());
		target.setUserpan(source.getUserpan());
		return target;
	}
	
	
	public static UserDetailsEntity parse(UserDetailsDto source) {
		UserDetailsEntity target = new UserDetailsEntity();
		target.setAddress(source.getAddress());
		target.setFirstname(source.getFirstname());
		target.setLastName(source.getLastName());
		target.setDob(source.getDob());
		target.setGender(source.getGender());
		target.setPassword(source.getPassword());
		target.setUsermobilenumber(source.getUsermobilenumber());
		//target.setRegistereddate(source.getRegistereddate());
		target.setBonus(2000);
		target.setRegistereddate("22-04-1990");
		target.setRole("User");
		return target;
	}
	
	
	public static UserDetailsEntity parse1(UserDetailsDto source) {
		UserDetailsEntity target = new UserDetailsEntity();
		target.setAddress(source.getAddress());
		target.setFirstname(source.getFirstname());
		target.setLastName(source.getLastName());
		target.setDob(source.getDob());
		target.setGender(source.getGender());
		target.setPassword(source.getPassword());
		target.setUsermobilenumber(source.getUsermobilenumber());
		//target.setRegistereddate(source.getRegistereddate());
		target.setBonus(2000);
		target.setRegistereddate("22-04-1990");
		target.setRole("Back Office");
		return target;
	}
	
	public static CompanyDetailsDto parse(CompanyDetailsEntity source) {
		CompanyDetailsDto target = new CompanyDetailsDto();
		target.setCompanyCode(source.getCompanyCode());
	    target.setCompanyOperations(source.getCompanyOperations());
	    target.setCompanySector(source.getCompanySector());
	    target.setCompanyTitle(source.getCompanyName());
	    target.setOpenSharePrice(source.getOpenSharePrice());
	    target.setShareCount(source.getShareCount());
	    target.setTurnOver(source.getTrunOver());
		return target;
	}
	
	public static CompanyDetailsEntity parse(CompanyDetailsDto source) {
		CompanyDetailsEntity target = new CompanyDetailsEntity();
		target.setCompanyCode(source.getCompanyCode());
	    target.setCompanyOperations(source.getCompanyOperations());
	    target.setCompanySector(source.getCompanySector());
	    target.setCompanyName(source.getCompanyTitle());
	    target.setOpenSharePrice(source.getOpenSharePrice());
	    target.setShareCount(source.getShareCount());
	    target.setTrunOver(source.getTurnOver());
		return target;
	}
	
	
	public static StockPriceDto parse(StockPriceEntity source) {
		StockPriceDto target = new StockPriceDto();
		target.setStockId(source.getStockId());
		target.setCurrentPrice(source.getCurrentPrice());
		target.setDateoftheStockPrice(source.getDateoftheStockPrice());
		target.setStockExchange(source.getStockExchange());
		target.setStockPriceatSpecificTime(source.getStockPriceatSpecificTime());
		return target;			
	}
	
	
	public static StockPriceEntity parse(StockPriceDto source) {
		StockPriceEntity target = new StockPriceEntity();
		target.setCurrentPrice(source.getCurrentPrice());
		target.setDateoftheStockPrice(source.getDateoftheStockPrice());
		target.setStockExchange(source.getStockExchange());
		target.setStockPriceatSpecificTime(source.getStockPriceatSpecificTime());
		return target;			
	}
	
	
	public static CommoditiesDto parse(CommoditiesEntity source) {
		CommoditiesDto target = new CommoditiesDto();
		target.setCommodityID(source.getCommodityID());
		target.setCommodityPrice(source.getCommodityPrice());
		target.setCommodityType(source.getCommodityType());
		target.setDate(source.getDate());
		return target;
		

		
	}
	
	public static CommoditiesEntity parse(CommoditiesDto source) {
		CommoditiesEntity target = new CommoditiesEntity();
		target.setCommodityID(source.getCommodityID());
		target.setCommodityPrice(source.getCommodityPrice());
		target.setCommodityType(source.getCommodityType());
		target.setDate(source.getDate());
		return target;
		

		
	}
	
}	