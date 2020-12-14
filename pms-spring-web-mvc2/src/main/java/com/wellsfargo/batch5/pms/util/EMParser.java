package com.wellsfargo.batch5.pms.util;

import java.util.Set;
import java.util.stream.Collectors;

import com.wellsfargo.batch5.pms.dto.UserDetailsDto;
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
		return target;
	}
	
	
	public static UserDetailsEntity parse(UserDetailsDto source) {
		UserDetailsEntity target = new UserDetailsEntity();
		target.setAddress(source.getAddress());
		//target.setBonus(source.getBonus());
		target.setFirstname(source.getFirstname());
		target.setLastName(source.getLastName());
		target.setDob(source.getDob());
		target.setGender(source.getGender());
		//target.setRegistereddate(source.getRegistereddate());
		//target.setRole(source.getRole());
		target.setBonus(2000);
		target.setRegistereddate("22-04-1990");
		target.setRole("User");
		return target;
	}
	
}	