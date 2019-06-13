package com.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector vector = new Vector();
		vector.add("Monday");
		vector.add("Tuesday");
		vector.add("Wednesday");
		vector.add("Thusday");
		vector.add("Friday");
		vector.add("Saturday");
		
		System.out.println("vector : " + vector);
		
		Enumeration enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			Object object = (Object) enumeration.nextElement();
			System.out.println("object : " + object);
		}
		
		
		
	}

}
