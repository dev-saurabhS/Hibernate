package com.ty.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class Mobile_Sim_Save_One_to_Many {

	public static void main(String[] args) {
		

		Mobile mobile1 = new Mobile();
		mobile1.setName("Samsung S22");
		mobile1.setCost(500.00);
		
		Mobile mobile2 = new Mobile();
		mobile2.setName("Nokia 3110");
		mobile2.setCost(80.58);
		
		Sim sim1 = new Sim();
		sim1.setName("Airtel-30");
		sim1.setProvider("Airtel");
		
		Sim sim2 = new Sim();
		sim2.setName("Airtel-70");
		sim2.setProvider("Airtel");
		
		Sim sim3 = new Sim();
		sim3.setName("Jio-90");
		sim3.setProvider("Jio");
		
		List<Sim> sims1 = new ArrayList<Sim>();
		List<Sim> sims2 = new ArrayList<Sim>();
		sims1.add(sim1);
		sims1.add(sim2);
		sims2.add(sim3);
		
		mobile1.setSim(sims1);
		mobile2.setSim(sims2);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(mobile1);
		entityManager.persist(mobile2);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityManager.persist(sim3);
		entityTransaction.commit();
		
		
	}

}
