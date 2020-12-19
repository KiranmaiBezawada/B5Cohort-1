package com.wellsfargo.batch5.pms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch5.pms.entity.UserDetailsEntity;

@Repository
public interface UserdetailsRepo extends JpaRepository<UserDetailsEntity,Long >{

	//@Query("select user from userDetails user where user.userpan = ?1")
	boolean existsByuserpan(String userpan);

}
