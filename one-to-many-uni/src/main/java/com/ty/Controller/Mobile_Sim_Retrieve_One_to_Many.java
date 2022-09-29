package com.ty.Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class Mobile_Sim_Retrieve_One_to_Many {

	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Mobile mobile = entityManager.find(Mobile.class, 5);
		
		System.out.println("Id of Mobile "+ mobile.getId() );
		System.out.println("Name of Mobile "+ mobile.getName());
		System.out.println("Cost of Mobile "+ mobile.getCost());
		
		List<Sim> sims = mobile.getSim();
		try {
		if(sims != null) {
			
			for(Sim sim_val: sims) {
				
				System.out.println("Id of the Sim "+ sim_val.getId());
				System.out.println("Name of the Sim "+ sim_val.getName());
				System.out.println("Name of the Sim Provide "+ sim_val.getProvider());
			
			}
		}
		}catch(NullPointerException e) {
			System.out.println("No Sim record found");
			e.printStackTrace();
		}
	}

}
