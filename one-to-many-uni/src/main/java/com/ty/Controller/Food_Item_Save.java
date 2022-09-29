package com.ty.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Food_Order;
import com.ty.dto.Item;

public class Food_Item_Save {

	public static void main(String[] args) {

		Food_Order foodOrder1 = new Food_Order();
		foodOrder1.setOrderTo("Saurabh S");
		foodOrder1.setStatus("Order being prepared");

		Food_Order foodOrder2 = new Food_Order();
		foodOrder2.setOrderTo("Aditi S");
		foodOrder2.setStatus("Out for Delivery");

		Item item1 = new Item();
		item1.setName("Chicken Biryani");
		item1.setQuantity(2);
		item1.setCost(900);

		Item item2 = new Item();
		item2.setName("Diet-Coke");
		item2.setQuantity(10);
		item2.setCost(600);

		Item item3 = new Item();
		item3.setName("Chicken popcorn");
		item3.setQuantity(2);
		item3.setCost(700);

		List<Item> items1 = new ArrayList<Item>();
		List<Item> items2 = new ArrayList<Item>();

		items1.add(item1);
		items1.add(item2);
		items2.add(item3);

		foodOrder1.setItem(items1);
		foodOrder2.setItem(items2);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(foodOrder1);
		entityManager.persist(foodOrder2);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityManager.persist(item3);
		entityTransaction.commit();

	}

}
