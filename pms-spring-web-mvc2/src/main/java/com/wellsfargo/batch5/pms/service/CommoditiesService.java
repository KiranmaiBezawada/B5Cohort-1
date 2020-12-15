package com.wellsfargo.batch5.pms.service;

import java.util.List;

import com.wellsfargo.batch5.pms.dto.CommoditiesDto;
import com.wellsfargo.batch5.pms.exception.PMSException;


public interface CommoditiesService {
	CommoditiesDto add(CommoditiesDto ud) throws PMSException;
	/*CommoditiesModel get(String username) throws PMSException; 
	List<CommoditiesModel> getAll() throws PMSException;
	void  delete(CommoditiesModel ud) throws PMSException;*/

}
