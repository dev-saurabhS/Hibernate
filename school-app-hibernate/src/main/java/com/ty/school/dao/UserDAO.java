package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.User;

public class UserDAO {

	public User saveUser(User user) {
		
		user.setEmail("Saurabh.Satpathi@gmail.com");
		user.setPassword("TXcY&5X$7");
		user.setPhone(9854210);
		user.setGender("Male");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		
		return new User();
				
	}
	
	public User findUserById(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		User user = entityManager.find(User.class, 1);
		
	if(user != null) {	
	
		System.out.println("User ID is "+ user.getId());
		System.out.println("Email ID is "+ user.getEmail());
		System.out.println("Password is "+ user.getPassword());
		System.out.println("Phone Number is "+ user.getPhone());
		System.out.println("Gender is "+ user.getGender());
	}
	else
		System.out.println("User ID not found");
		
	  return new User();
	}
	
	public boolean deleteUser(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, 1);
		if (user != null) {

			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		
		return false;
	}
	
	public User updateUser(User user) {
		user.setPhone(7);
		user.setEmail("Anjali.Sharma@gmail.com");
		user.setPassword("huf&2T8$");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();

		return new User();
	}
	
}
