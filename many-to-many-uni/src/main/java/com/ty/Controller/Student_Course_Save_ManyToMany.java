package com.ty.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Course;
import com.ty.dto.Student;

public class Student_Course_Save_ManyToMany {

	public static void main(String[] args) {

		
	
/*	Course course1 = new Course();
	course1.setName("Quantum-Physics");
	course1.setCost(1500);
	
	Course course2 = new Course();
	course2.setName("Astro-Physics");
	course2.setCost(1800);
	
	Course course3 = new Course();
	course3.setName("Spanish Literature");
	course3.setCost(2500);
	
	List<Course> courses1 = new ArrayList<Course>();
	courses1.add(course1);
	courses1.add(course2);
		
		
	Student student1 = new Student();
	student1.setName("Sameer");
	student1.setEmail("sameer.arya@gmail.com");
	student1.setCourse(courses1);
	*/
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	Course coursesA = entityManager.find(Course.class, 1);
	Course coursesB = entityManager.find(Course.class, 3);
	
	List<Course> courses2 = new ArrayList<Course>();
	courses2.add(coursesA);
	courses2.add(coursesB);
	
	Student student2 = new Student();
	student2.setName("Neha");
	student2.setEmail("Neha.Urkude@gmail.com");
	student2.setCourse(courses2);   

	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	entityTransaction.begin();
//	entityManager.persist(course1);
//	entityManager.persist(course2);
//	entityManager.persist(course3);
	entityManager.persist(coursesA);
	entityManager.persist(coursesB);
//	entityManager.persist(student1);
	entityManager.persist(student2);
	entityTransaction.commit();
	
	}

}
