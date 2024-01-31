package com.xworkz.practice.things;

import java.util.Stack;

public class StackDemo {
	//Stack is a subclass of vector class that implements a standard LIFO
	// Stack Only defines default constructor  which creates an empty stack
	//methods in stack is pop push search  empty peek
	
	public static void showPush(Stack st,int a) {
    	st.push(new Integer(a));
    	System.out.println(a);
    	
    }
	public static void showPop(Stack st) {
		System.out.println(st.pop());
	}
	
	public static void showPeek(Stack st) {
		System.out.println(st.peek());
	}
}
