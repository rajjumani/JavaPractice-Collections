package com.Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack stack = new Stack<>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		
		System.out.println("stack : " + stack);

		Iterator it = stack.iterator();
		while (it.hasNext()) {
			//Object object = (Object) it.next();
			System.out.println("object : " + it.next());
		}
	
		System.out.println("peek : " + stack.peek());
		System.out.println("ppop : " + stack.pop());
		
	
		it = stack.iterator();
		while (it.hasNext()) {
			//Object object = (Object) it.next();
			System.out.println("object : " + it.next());
		}
		
	}

}
