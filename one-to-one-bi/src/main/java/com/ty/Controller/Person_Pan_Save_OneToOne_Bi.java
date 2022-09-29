package com.ty.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class Person_Pan_Save_OneToOne_Bi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = new Person();
		person.setId(1);
		person.setName("Saurabh");
		person.setGender("Male");
		

		Pan pan = new Pan();
		pan.setId(100);
		pan.setPan_number("GHT8JK2D");
		pan.setType("Business");
		
		pan.setPerson(person);

		person.setPan(pan);

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}

}
