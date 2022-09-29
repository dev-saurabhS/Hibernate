package com.ty.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.FoodOrder;
import com.ty.dto.Item;

public class Food_Item_Save_ManyToOne {

	public static void main(String[] args) {
		
		FoodOrder foodOrder1 = new FoodOrder();
		foodOrder1.setOrderTo("Sachin");
		foodOrder1.setStatus("Awaiting confirmation");
		
		FoodOrder foodOrder2 = new FoodOrder();
		foodOrder2.setOrderTo("Mayank");
		foodOrder2.setStatus("Out for Delivery");
		
		FoodOrder foodOrder3 = new FoodOrder();
		foodOrder3.setOrderTo("Atul");
		foodOrder3.setStatus("Deliverd");
		
		
		Item item1 = new Item();
		item1.setName("Panner Tikka");
		item1.setQuantity(2);
		item1.setCost(300);
		item1.setFoodOrder(foodOrder1);
		
		Item item2 = new Item();
		item2.setName("Chicken Burger");
		item2.setQuantity(3);
		item2.setCost(600);
		item2.setFoodOrder(foodOrder2);
		
		Item item3 = new Item();
		item3.setName("Hakka Noodles");
		item3.setQuantity(2);
		item3.setCost(400);
		item3.setFoodOrder(foodOrder3);
		
		Item item4 = new Item();
		item4.setName("Momo");
		item4.setQuantity(3);
		item4.setCost(450);
		item4.setFoodOrder(foodOrder1);
		
		Item item5 = new Item();
		item5.setName("KitKat-Oreo Shake");
		item5.setQuantity(1);
		item5.setCost(280);
		item5.setFoodOrder(foodOrder2);
		
		Item item6 = new Item();
		item6.setName("Mango Smoothie");
		item6.setQuantity(1);
		item6.setCost(250);
		item6.setFoodOrder(foodOrder2);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(foodOrder1);
		entityManager.persist(foodOrder2);
		entityManager.persist(foodOrder3);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityManager.persist(item3);
		entityManager.persist(item4);
		entityManager.persist(item5);
		entityManager.persist(item6);
		entityTransaction.commit();

		
	}

}
