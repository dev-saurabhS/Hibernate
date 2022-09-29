package com.ty.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Branch;
import com.ty.dto.Hospital;

public class Hospital_Branch_Save_ManyToOne {

	public static void main(String[] args) {
		
		
		Hospital hospital1 = new Hospital();
		hospital1.setName("AIIMS");
		hospital1.setWebsite("www.aiimshospitals.com");
		
		Hospital hospital2 = new Hospital();
		hospital2.setName("Narayana HealthCare");
		hospital2.setWebsite("www.narayanahealthcare.com");
		
		Branch branch1 = new Branch();
		branch1.setCity("Delhi");
		branch1.setPhone(888220);
		branch1.setHospital(hospital2);
		
		Branch branch2 = new Branch();
		branch2.setCity("Mumbai");
		branch2.setPhone(662240);
		branch2.setHospital(hospital2);
		
		Branch branch3 = new Branch();
		branch3.setCity("Bengaluru");
		branch3.setPhone(777210);
		branch3.setHospital(hospital1);
		
		Branch branch4 =  new Branch();
		branch4.setCity("Kolkata");
		branch4.setPhone(992250);
		branch4.setHospital(hospital2);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(hospital1);
		entityManager.persist(hospital2);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityManager.persist(branch4);
		entityTransaction.commit();
	}

}
