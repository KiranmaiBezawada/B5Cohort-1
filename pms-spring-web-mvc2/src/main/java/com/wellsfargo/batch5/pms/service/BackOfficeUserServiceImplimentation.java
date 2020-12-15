package com.wellsfargo.batch5.pms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.wellsfargo.batch5.pms.dto.UserDetailsDto;
import com.wellsfargo.batch5.pms.exception.PMSException;
import com.wellsfargo.batch5.pms.repo.UserdetailsRepo;
import com.wellsfargo.batch5.pms.util.EMParser;

@Service
public class BackOfficeUserServiceImplimentation  implements BackOfficeUserService{
	@Autowired
	private UserdetailsRepo userdetailsrepo;
  
	@Transactional
	@Override
	public UserDetailsDto add(UserDetailsDto userdetail) throws PMSException {
	   	userdetail=EMParser.parse(userdetailsrepo.save(EMParser.parse1(userdetail)));
		return userdetail;
	}


	@Override
	public List<UserDetailsDto> getAll() throws PMSException {
		
		return userdetailsrepo.findAll().stream().map(e->EMParser.parse(e)).collect(Collectors.toList());

	}

	@Override
	public void delete(UserDetailsDto ud) throws PMSException {
	
		
	}

	@Override
	public UserDetailsDto get(Integer userpan) throws PMSException {
		// TODO Auto-generated method stub
		return null;
	}

}
