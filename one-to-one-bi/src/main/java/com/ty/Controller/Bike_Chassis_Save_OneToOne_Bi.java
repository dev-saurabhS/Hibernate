package com.ty.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Bike;
import com.ty.dto.Chassis;


public class Bike_Chassis_Save_OneToOne_Bi {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Bike bike = new Bike();
		bike.setName("BMW S1000RR");
		bike.setCost(3900000);
		

		Chassis chassis = new Chassis();
		chassis.setType("Single-Cradle");
		bike.setChassis(chassis);
		chassis.setBike(bike);

		

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(bike);
		entityManager.persist(chassis);
		entityTransaction.commit();
	}
		
}
