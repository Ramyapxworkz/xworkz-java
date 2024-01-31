package com.xworkz.practice.driver;

import java.util.Stack;

import com.xworkz.practice.things.StackDemo;

public class StackDemoRunner {
	public static void main(String[] args) {
		Stack st=new Stack();
		StackDemo.showPush(st,22);
		StackDemo.showPush(st,55);
		StackDemo.showPush(st,78);
		System.out.println(st);
		StackDemo.showPop(st);
		StackDemo.showPeek(st);
	}

}
