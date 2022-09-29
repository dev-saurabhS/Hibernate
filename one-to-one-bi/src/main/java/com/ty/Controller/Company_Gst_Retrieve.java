package com.ty.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.Gst;

public class Company_Gst_Retrieve {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		
		Gst gst = entityManager.find(Gst.class, 2201);  // pass the id of gst class

		System.out.println("Gst Id of the company is " + gst.getId());
		System.out.println("Gst Number of the company is " + gst.getNumber());
		System.out.println("Gst status of the company " + gst.getStatus());

		Company company = gst.getCompany();

		try {
		if (company != null) {

			System.out.println("Company ID is : " + company.getId());
			System.out.println("Company Name is : " + company.getName());
			System.out.println("Company Address is : " + company.getAddress());
			}
		}catch(NullPointerException e) {
			System.out.println("No company data found");
			e.printStackTrace();
		}
	}

}
