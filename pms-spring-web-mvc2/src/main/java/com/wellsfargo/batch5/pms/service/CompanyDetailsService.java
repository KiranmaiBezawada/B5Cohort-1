package com.wellsfargo.batch5.pms.service;

import java.util.List;

import com.wellsfargo.batch5.pms.dto.CompanyDetailsDto;
import com.wellsfargo.batch5.pms.dto.UserDetailsDto;
import com.wellsfargo.batch5.pms.exception.PMSException;



public interface CompanyDetailsService {
	CompanyDetailsDto add(CompanyDetailsDto ud) throws PMSException;
	CompanyDetailsDto getById(Long companyCode) throws PMSException; 
	List<CompanyDetailsDto> getAll() throws PMSException;
	/*List<CompanyDetailsModel> getAll() throws PMSException;
	void  delete(CompanyDetailsModel ud) throws PMSException;
	CompanyDetailsModel  update(CompanyDetailsModel ud) throws PMSException;*/
}
