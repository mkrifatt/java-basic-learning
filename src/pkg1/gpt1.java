package pkg1;

import java.util.ArrayList;
import java.util.List;


public class gpt1 {
//	--FOllOW (7) UNDER CLASSES
//	---------------------------------
//	step 1: define the class variables blueprint
	String name;
	int age;
	
	
//	--FOllOW (8) UNDER METHOD
//	---------------------------------
//	public int add(int int1, int int2) {
//		return int1 + int2;
//	}
//	public String getName() {
//		return "kudrat";
//	}
//	public void greet() {
//		System.out.println("Hello, welcome to the java program!");
//	}
	public static void main(String[] args) {
//		--------------------------
//	1--BASIC
//		String name = "kudrat";
//		int age = 25;
//		
//		System.out.println(name);
		
		
//		--------------------------
//	2--CONDITION
//		if(age >= 18) {
//			System.out.println("Adult");
//		}else {
//			System.out.println("Minor");
//		}
		
//	3--FOR LOOP
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
		
		
//		-----------------------------------
//	4--ENCHSED FOR LOOP
//		String[] names = {"kudrat", "rana", "rifat"};
//		
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		
//		----------------------
//	5--STRING ARRAY
//		String[] names = {"kudrat","rahim", "rana"};
//		System.out.println(names[0]);
//	}
		
		
//}		-----------------------------------
//	6--LIST STRING
//		List<String> names = new ArrayList<>();
//		
//		names.add("kudrat");
//		names.add("rahim");
//		names.add("karim");
//		
//		System.out.println(names.get(1));
		
		
//		-----------------------------
//	7-- CLASSES
//		step2: create an object/instance of the gpt1 class
		gpt1 user = new gpt1();
		
//		step3: assign values to the class variables using the object
		user.name = "kudrat";
		user.age = 25;
		
//		step4: access the class variables using the object and print them
		System.out.println("Name: " + user.name);
		System.out.println("Age: " + user.age);
		
		
//		-------------------------
//		8--METHOD
//		<creating an object of the gpt1 class beacause the add method is not static but 
//		if it is static then we can call it directly without creating an object
//		as a example, if the add method is static then we can call it like this: gpt1.add(5, 10);>
		
//		gpt1 demo = new gpt1();
//		int sum = demo.add(5, 10);
//		System.out.println("Sum: " + sum);
//		
//		String name = demo.getName();
//		System.out.println("Name: " + name);
//		demo.greet();

		
	}
}
