package Arraylist;

import java.util.ArrayList;

public class Demo 
{
public static void main(String[] args)
{
	String[] fruits = new String[4];
	fruits[0]="mango";
	fruits[1]="apple";
	fruits[2]="orange";
	
	System.out.println(fruits);
		
	ArrayList fruitList = new ArrayList();
	fruitList.add("Mango");
	fruitList.add("Apple");
	fruitList.add("Strawberry");
	fruitList.add("Watermelon");

	fruitList.remove("Strawberry");
	//fruitList.clear();
	System.out.println(fruitList.contains("mango"));

	System.out.println(fruitList);
}


}
