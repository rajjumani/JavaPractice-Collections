package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer, String> map = new HashMap();
		map.put(1, "abc");
		map.put(2, "ios");
		map.put(3, "pqr");
		map.put(4, "abc");
		map.put(5, "demo");
		
		System.out.println("map : "+ map);
		
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Entry) it.next();
			System.out.println("key : " + me.getKey());
			System.out.println("value : " + me.getValue());
			
		}
		
	}

}
