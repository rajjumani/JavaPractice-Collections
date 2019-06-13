package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List list =new ArrayList<>();
		list.add("abc");
		list.add("ios");
		list.add("pqr");
		list.add("xyz");
		list.add("kjl");
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object object = (String) it.next();
			if(object.toString().equalsIgnoreCase("ios")){
				it.remove();
			}
			System.out.println("element : " + object);
		}
		
		System.out.println("list : " + list);
		
		ListIterator lit = list.listIterator(list.size());
		while (lit.hasPrevious()) {
			Object object = (Object) lit.previous();
			System.out.println("object : " + object);
		}
		
		
		
		

	}

}
