package com.ty.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class Person_Pan_Retrieve_OneToOne_Bi {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);   //pass the id of person class

		System.out.println("Person Id of the person is : " + person.getId());
		System.out.println("Name of the person is : " + person.getName());
		System.out.println("Gender of the person is :"+ person.getGender());

		Pan pan = person.getPan();
	
		try {
			if (pan != null) {
				

				System.out.println("Id of the Pan Card " + pan.getId());
				System.out.println("Pan Number is " + pan.getPan_number());
				System.out.println("Type of the Pan is " + pan.getPan_number());
				System.out.println("-------------------------------");
			}
		} catch (NullPointerException e) {

			System.out.println("No Pan record identified for the Person");
			e.printStackTrace();
		}
	}

}
