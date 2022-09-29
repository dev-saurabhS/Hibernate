package com.ty.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Branch;
import com.ty.dto.Hospital;

public class Hospital_Branch_Retrieve_ManyToOne {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Branch branch = entityManager.find(Branch.class, 2);
		System.out.println("Branch Id is : " + branch.getId());
		System.out.println("Branch Id is : " + branch.getCity());
		System.out.println("Branch Id is : " + branch.getPhone());
		System.out.println("Branch Id is : " + branch.getHospital());

		Hospital hospitals = branch.getHospital();
		
		System.out.println("-------********--------");
		
	try {	
	if(hospitals!=null) {
		
	
		System.out.println("ID of Hospital : "+ hospitals.getId());
		System.out.println("Name of Hospital : "+ hospitals.getName());
		System.out.println("Website of Hospital : "+ hospitals.getWebsite());
	}
	}catch(NullPointerException e) {
		
		System.out.println("Hospital Records not found");
		e.printStackTrace();
	}

	}
}
