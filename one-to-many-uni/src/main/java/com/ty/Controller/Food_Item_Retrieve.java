package com.ty.Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Food_Order;
import com.ty.dto.Item;

public class Food_Item_Retrieve {

	public static void main(String[] args) {
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Food_Order foodOrder = entityManager.find(Food_Order.class, 1);
		
		System.out.println("Order Id :"+foodOrder.getId());
		System.out.println("Order Person Name :"+foodOrder.getOrderTo());
		System.out.println("Status of Order :"+foodOrder.getStatus());
		
		List<Item> items = foodOrder.getItem();
		
		
		try {
		if(items!=null) {
			
			for(Item value:items) {
				
				System.out.println("Item Id :"+value.getId());
				System.out.println("Item Name :"+value.getName());
				System.out.println("Quantity ordered :"+value.getQuantity());
				System.out.println("Price of Item :"+value.getCost());
			}
		}
		}catch(NullPointerException e) {
			
			System.out.println("No item added inside order");
			e.printStackTrace();
		}

	}

}
