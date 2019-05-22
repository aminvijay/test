package com.test.algorythm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemSortDemo {

	public static void main(String[] args) {
		//id, price, name, total
		Iteam i1 = new Iteam(3, 10, "Vijay", 21);
		Iteam i2 = new Iteam(5, 7, "Avani", 17);
		Iteam i3 = new Iteam(1, 12, "Jyot", 31);
		Iteam i4 = new Iteam(2, 25, "Shlok", 10);
		
		List<Iteam> list = new ArrayList<Iteam>();
		
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		
		System.out.println("list " + list);
		
		Collections.sort(list);
		System.out.println("list after sort " + list);
		
		Collections.reverse(list);
		
		System.out.println("list reverse sort " + list);
		
		Collections.sort(list, new Iteam.GetByName());
		
		System.out.println("list sort by name " + list);
		
		Collections.sort(list, new Iteam.GetByPrice());
		
		System.out.println("list sort by price " + list);
		
		Collections.sort(list, new Iteam.GetByTotal());
		
		System.out.println("list sort by total " + list);
	}

}
