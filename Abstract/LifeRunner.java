package com.xworkz.life;

import com.xworkz.life.abstractImpliments.Life;
import com.xworkz.life.runner.Human;

public class LifeRunner {
	public static void main(String[] args) {
		Life l=new Human();
		l.eat();
		l.create();
		l.exercise();
		l.explore();
		l.learn();
		l.reflect();
		l.relax();
		l.sleep();
		l.socialize();
	}

}
