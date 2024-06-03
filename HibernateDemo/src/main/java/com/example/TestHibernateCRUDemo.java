package com.example;

import java.util.List;

import org.hibernate.Session;
import com.example.model.MyUser;

public class TestHibernateCRUDemo {

	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		// TODO Auto-generated method stub
		MyUser userObj = new MyUser();
		userObj.setId(1);
		userObj.setUsername("john");
		userObj.setPassword("123456");
		
		session.save(userObj);
		
		session.getTransaction().commit();
//		HibernateUtil.shutdown();
		
		
	}

}
