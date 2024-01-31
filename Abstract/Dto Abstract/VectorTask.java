package com.xworkz.practice.things;

import java.util.Vector;

public class VectorTask {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(1);
		vector.add(2);
		vector.add(5);
		vector.add(6);
		vector.add(8);
		System.out.println(vector);
		vector.add(1, 10);
		System.out.println(vector);
		System.out.println(vector.capacity());
		System.out.println(vector.remove(4));
		
		//System.out.println(vector.contains(6));
		System.out.println("Size"+vector.size());
	}

}
