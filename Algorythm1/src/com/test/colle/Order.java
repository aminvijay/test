package com.test.colle;

import java.util.Comparator;

/**
 * @author vamin
 *
 */
public class Order implements Comparable<Order>{

	private int orderId;
	private int price;
	private int count;
	private String name;
	
	public Order(int orderId, int price, int count, String name) {
		this.orderId = orderId;
		this.price = price;
		this.count = count;
		this.name = name;
	}
	
	public String toString() {
		return "orderId = " + orderId + " price = " + price + " count =  " + count + " name = " + name;
	}
	
	public int compareTo(Order o){
		return orderId > o.orderId ?1:0;
	}
	
	public static class OrderByPrice implements Comparator<Order> {
		
		public int compare(Order o1, Order o2) {			
			return o1.getPrice()>o2.getPrice()?1:0;
		}
	}
	
	public static class OrderByCount implements Comparator<Order> {
		public int compare(Order o1, Order o2){
			return o1.getCount() > o2.getCount()?1:0;
		}
	}
	
	public static class OrderByName implements Comparator<Order>{
		public int compare(Order o1, Order o2){
			return o1.getName().compareTo(o2.getName());
		}
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
}
