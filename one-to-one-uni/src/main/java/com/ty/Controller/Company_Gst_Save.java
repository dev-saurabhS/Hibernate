package com.ty.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.Gst;

public class Company_Gst_Save {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Company company = new Company();
		company.setId(101);
		company.setName("Saurabh Enterprises");
		company.setAddress("Jharkhand");

		Gst gst = new Gst();

		gst.setId(2201);
		gst.setNumber("SGJ5KVX7");
		gst.setStatus("Active");
		gst.setCompany(company);

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}
