package com.naresh.combo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main (String[] args)
	{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
	EntityManager em = emf.createEntityManager();
	
	//ONE TO ONE
//	User u = new User();
//	u.setFirstname("ganga");
//	u.setLastname("reddy");
//
//	Address a = new Address();
//	a.setCity("des moines");
//	a.setStreet("pamela");
//	a.setState("iowa");
//	
//	u.setAddress(a);
//	
//	em.getTransaction().begin();
//	em.persist(u);
//	em.getTransaction().commit();

	}
}
