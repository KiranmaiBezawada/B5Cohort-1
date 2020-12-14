package com.wellsfargo.batch5.pms.util;

import java.util.Set;
import java.util.stream.Collectors;

import com.wellsfargo.batch5.pms.entity.UserDetailsEntity;
import com.wellsfargo.batch5.pms.model.UserDetailsModel;


public class EMParser {
	
	public static UserDetailsModel parse(UserDetailsEntity source) {
		UserDetailsModel target = new UserDetailsModel();
		target.setAddress(source.getAddress());
		target.setBonus(source.getBonus());
		target.setFirstname(source.getFirstname());
		target.setLastName(source.getLastName());		
		target.setRole(source.getRole());	
		target.setPassword(source.getPassword());
		target.setUserpan(source.getUserpan());
		target.setUsername(source.getUserName());
		return target;
	}
	
}	