
package com.wellsfargo.batch5.pms.service;

import java.util.List;

import com.wellsfargo.batch5.pms.dto.UserDetailsDto;
import com.wellsfargo.batch5.pms.exception.PMSException;

public interface BackOfficeUserService {
	UserDetailsDto add(UserDetailsDto userdetail) throws PMSException;
	UserDetailsDto get(Integer userpan) throws PMSException; 
	List<UserDetailsDto> getAll() throws PMSException;
	void  delete(UserDetailsDto ud) throws PMSException;
}
