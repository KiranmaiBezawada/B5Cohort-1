package com.wellsfargo.batch5.pms.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory emFactory;
	static {
		emFactory=Persistence.createEntityManagerFactory("mysqlPU");
	}
	public static EntityManager getEntityManager() {
		return emFactory.createEntityManager();
	}

}
