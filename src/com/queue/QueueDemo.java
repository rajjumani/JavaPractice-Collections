package com.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class QueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q  =    new LinkedList<>();
		
		//System.out.println("element : " + q.element());
		//System.out.println("peek : " + q.peek());
		
		//System.out.println("poll ; " + q.poll());
		//System.out.println("remove : " + q.remove());
		
		
		q.add("abc");
		q.add("ios");
		q.add("pqr");
		q.add("jkl");
		q.add("mno");
		q.add("yui");
		
		System.out.println("q : " + q);
		
		
		
	}

}
