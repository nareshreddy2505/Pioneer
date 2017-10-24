package com.naresh.Jpahibernate.entity;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Test {
public static void main (String [] args)
{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
	//emf.close();
	
	EntityManager em = emf.createEntityManager();
//INSERT INTO
//	Student st = new Student();
//	st.setCity("missouri");
//	st.setEmail("qwerty@gmail.com");
//	st.setFirstname("nanana");
//	st.setLastname("kakakaka");
//	em.getTransaction().begin();
//	em.persist(st);
//	em.getTransaction().commit();
	
	//FIND BY ID
//    Student st = em.find(Student.class, "84fcbd1b-cd24-486a-ac35-e7871e8ed8ea");
//    System.out.println(st);
	
	//UPDATE
//	Student st = em.find(Student.class, "84fcbd1b-cd24-486a-ac35-e7871e8ed8ea");
//    st.setLastname("kot");
//    em.getTransaction().begin();
//    em.merge(st);
//    em.getTransaction().commit();
//    System.out.println(st);
	
	//DELETE
//	Student st = em.find(Student.class, "84fcbd1b-cd24-486a-ac35-e7871e8ed8ea");
//	em.getTransaction().begin();
//	em.remove(st);
//	em.getTransaction().commit();
	
	//FIND ALL
	TypedQuery<Student> tq = em.createQuery("SELECT s from Student s", Student.class);
	List<Student> students = tq.getResultList();
	System.out.println(students);
	
}
}
