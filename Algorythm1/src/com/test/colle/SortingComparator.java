package com.test.colle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingComparator {

	public static void main(String[] args) {
		//id, price, count, name
		Order o2= new Order(3,30, 30, "Vijay");
		Order o3= new Order(2,20, 200, "Jyot");
		Order o4= new Order(4,4, 400, "Shlok");
		Order o1= new Order(1,10, 100, "Avani");
		Order o5= new Order(5,50, 500, "Amin");
		
		List<Order> li = new ArrayList<Order>();
		li.add(o2);
		li.add(o3);
		li.add(o4);
		li.add(o1);
		li.add(o5);
		
		System.out.println("Unsorted Collection : " + li);		
		
		Collections.sort(li);		
		System.out.println("Sorted Collection : " + li);
		
		Collections.sort(li, Collections.reverseOrder());		
		System.out.println("Reverse Sorted Collection : " + li);
		
		Collections.sort(li, new Order.OrderByCount());		
		System.out.println("Order By Count : " + li);
		
		Collections.sort(li, new Order.OrderByPrice());
		System.out.println("Order By Price : " + li);
		
		Collections.sort(li, new Order.OrderByName());
		System.out.println("Order By Name : " + li);
	}

}
