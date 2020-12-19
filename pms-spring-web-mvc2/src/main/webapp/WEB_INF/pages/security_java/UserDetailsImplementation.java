package com.wellsfargo.batch5.pms.security;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.wellsfargo.batch5.pms.entity.AdminUser;
import com.wellsfargo.batch5.pms.repo.AdminRepo;

@Service
public class UserDetailsImplementation implements UserDetailsService {

	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails user = null;
		
		if (!adminRepo.existsByUserName(username)) {
			throw new UsernameNotFoundException("Invalid user credentials");
		}
		
		
		AdminUser adminUser = adminRepo.findByUserName(username);
		System.out.println(adminUser);
		user = (UserDetails) new User(adminUser.getUserName(),adminUser.getPassword(),Collections.singletonList(new SimpleGrantedAuthority(adminUser.getRole())));
		System.out.println(user);
		
	
		return user;
	}
	
	
	/*public void registerUser(RegisterLibraryMemberModel libMember) throws PMSException {
		if (libMember!=null) {
			if (libMember.getPassword().equals(libMember.getConfimrPassword())) {
				 libMember.setPassword(encoder.encode(libMember.getPassword()));
				 userRepo.save(EMParser.parse(libMember));
			}
			else {				throw new LibraryException("Pwd not match");
			}
		}*/
	

	
	
	
	
	

}
