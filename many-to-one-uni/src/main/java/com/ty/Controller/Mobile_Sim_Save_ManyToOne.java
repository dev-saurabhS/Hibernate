package com.ty.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class Mobile_Sim_Save_ManyToOne {

	public static void main(String[] args) {

		Mobile mobile1 = new Mobile();
		mobile1.setName("Apple Iphone 14");
		mobile1.setCost(70000);

		Mobile mobile2 = new Mobile();
		mobile2.setName("Samsung S22 Ultra");
		mobile2.setCost(80000);

		Sim sim1 = new Sim();
		sim1.setName("Air_YS-301");
		sim1.setProvider("Airtel");
		sim1.setMobile(mobile1);

		Sim sim2 = new Sim();
		sim2.setName("Air_BH-401");
		sim2.setProvider("Airtel");
		sim2.setMobile(mobile2);

		Sim sim3 = new Sim();
		sim3.setName("Jio_JX-221");
		sim3.setProvider("Reliance Jio");
		sim3.setMobile(mobile1);

		Sim sim4 = new Sim();
		sim4.setName("Jio_JX-225");
		sim4.setProvider("Reliance Jio");
		sim4.setMobile(mobile1);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(mobile1);
		entityManager.persist(mobile2);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityManager.persist(sim3);
		entityManager.persist(sim4);
		entityTransaction.commit();

	}

}
