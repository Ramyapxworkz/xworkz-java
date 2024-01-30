package com.xworkz.arraylist.runenr;

import java.util.ArrayList;

public class CManmes {
	public static void main(String[] args) {
		ArrayList arrayList= new ArrayList();
		arrayList.add("Prema Khandu");
		arrayList.add("Manohar");
		arrayList.add("Arvind");
		arrayList.add("Hemantha");
		System.out.println(arrayList);
		//array with index will add one more element to that array it will not remove the elemet
		arrayList.add(1, "DK");
//		System.out.println(arrayList);
//		arrayList.addAll(arrayList);
//		System.out.println(arrayList);
		
//		arrayList.addAll(3, arrayList);
		System.out.println(arrayList);
		
		System.out.println("Clone method"+arrayList.clone());
		
		System.out.println(arrayList.contains("Manohar"));
		
		System.out.println(arrayList.containsAll(arrayList));
		
		arrayList.ensureCapacity(2);

		System.out.println(arrayList.equals("Hemantha"));
		arrayList.forEach(s->System.out.println(s));
		System.out.println("Get the value:"+arrayList.get(3));
		
		System.out.println("ArrayList IndexOf:"+arrayList.indexOf("Manohar"));
		System.out.println(arrayList.iterator());
		System.out.println(arrayList.lastIndexOf(arrayList));
		System.out.println(arrayList.listIterator());
		System.out.println(arrayList.remove(2));
		System.out.println(arrayList.spliterator().characteristics());
		System.out.println(arrayList.size());
		System.out.println(arrayList.spliterator());
		System.out.println(arrayList.subList(0, 3));
		System.out.println(arrayList.toArray());
		
	}
	}


