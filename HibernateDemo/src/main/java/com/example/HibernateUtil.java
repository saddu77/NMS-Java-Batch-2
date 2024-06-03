package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
	
public class HibernateUtil {
	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			if(sessionFactory == null) {
				StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().
																configure("hibernate.cfg.xml").
																build();
				
				Metadata mData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
				sessionFactory = mData.getSessionFactoryBuilder().build();
			}			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		// TODO Auto-generated method stub
		return sessionFactory;
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static void shutdown() {
		getSessionFactory().close();
	}
	
}
