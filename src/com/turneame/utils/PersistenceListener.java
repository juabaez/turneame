package com.turneame.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class PersistenceListener implements ServletContextListener {
	private static EntityManagerFactory emf;
	  
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		emf = Persistence.createEntityManagerFactory("turneame");
	}  

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		if (emf != null)
			emf.close();
	}

	// Method static for be used when add, modify, delete and list objects from db.	
	public static EntityManager createEntityManager() {
        if (emf == null) {
            throw new IllegalStateException("Context is not initialized yet.");
        }
        return emf.createEntityManager();
    }
	
}  
