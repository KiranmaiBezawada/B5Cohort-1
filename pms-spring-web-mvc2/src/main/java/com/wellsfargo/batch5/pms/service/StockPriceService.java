package com.wellsfargo.batch5.pms.service;

import com.wellsfargo.batch5.pms.dto.StockPriceDto;
import com.wellsfargo.batch5.pms.exception.PMSException;


public interface StockPriceService {
	StockPriceDto add(StockPriceDto stock) throws PMSException;
	/*StockPriceModel get(String username) throws PMSException; 
	List<StockPriceModel> getAll() throws PMSException;
	void  delete(StockPriceModel ud) throws PMSException;
	StockPriceModel  update(StockPriceModel ud) throws PMSException;*/

}
