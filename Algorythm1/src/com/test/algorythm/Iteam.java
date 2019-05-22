package com.test.algorythm;

import java.util.Comparator;

public class Iteam implements Comparable<Iteam>{
	
	private int id;
	private int price;
	private String name;
	private int total;
	
	public Iteam(int id,int price,String name, int total){
		this.id = id;
		this.price = price;
		this.name = name;
		this.total = total;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public String toString() {
		return "id = " + id + " price = " + price + " name = " + name + " total = " + total;
	}
	@Override
	public int compareTo(Iteam arg0) {
		
		return arg0.getId()-id;
	}
	
	public static class GetByName implements Comparator<Iteam> {

		@Override
		public int compare(Iteam arg0, Iteam arg1) {
			return arg0.getName().compareTo(arg1.getName());
		}
		
	}
	
	public static class GetByPrice implements Comparator<Iteam> {
		
		public int compare(Iteam arg0, Iteam arg1) {
			return arg0.getPrice()-arg1.getPrice();
		}
	}
	
	public static class GetByTotal implements Comparator<Iteam> {
		public int compare(Iteam arg0, Iteam arg1) {
			return arg0.getTotal()-arg1.getTotal();
		}
	}

}
