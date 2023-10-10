package com.xworkz.september.driver;

import com.xworkz.september.things.Sweet;
public class SweetRunner {
	public static void main(String args[]) {
		
	Sweet sweet=new Sweet();
	System.out.println(sweet);
	sweet.name="Sweet potato";
	sweet.calories=86;
	sweet.protein=1.6f;
	sweet.sugar=4.2f;
	sweet.water=77;
	System.out.println(sweet.name);
	System.out.println(sweet.calories);
	System.out.println(sweet.protein);
	System.out.println(sweet.sugar);
	System.out.println(sweet.water);
	
	System.out.println("creat 1 object");
	Sweet sweet1=new Sweet();
	sweet1.name="jalebi";
	sweet1.calories=70;
	sweet1.protein=2.6f;
	sweet1.sugar=3.2f;
	sweet1.water=78;
	System.out.println(sweet1.name);
	System.out.println(sweet1.calories);
	System.out.println(sweet1.protein);
	System.out.println(sweet1.sugar);
	System.out.println(sweet1.water);
	
	System.out.println("creat 2 object");
	Sweet sweet2=new Sweet();
	sweet2.name="jalebi";
	sweet2.calories=70;
	sweet2.protein=2.6f;
	sweet2.sugar=3.2f;
	sweet2.water=78;
	System.out.println(sweet2.name);
	System.out.println(sweet2.calories);
	System.out.println(sweet2.protein);
	System.out.println(sweet2.sugar);
	System.out.println(sweet2.water);
	
	new Sweet("sweet potato",77,77,8.4f,3.2f);
	
	
}

}
