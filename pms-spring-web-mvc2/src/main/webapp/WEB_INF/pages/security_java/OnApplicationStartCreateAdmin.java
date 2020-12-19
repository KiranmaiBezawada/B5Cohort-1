package com.wellsfargo.batch5.pms.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.wellsfargo.batch5.pms.entity.AdminUser;
import com.wellsfargo.batch5.pms.repo.AdminRepo;


@Component
public class OnApplicationStartCreateAdmin {

	@Autowired
	private AdminRepo repo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@EventListener
	public void checkAndCreateAdmin(ApplicationStartedEvent event) {
		if(!repo.existsByUserName("superUser")) {
			repo.save(new AdminUser(null, "superUser", encoder.encode("superUser"),"admin"));
		}
	}
}
