package com.wellsfargo.batch5.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch5.pms.entity.AdminUser;


@Repository
public interface AdminRepo extends JpaRepository<AdminUser, Integer>{
	
	public boolean existsByUserName(String userName);
	public AdminUser findByUserName(String userName);
}
