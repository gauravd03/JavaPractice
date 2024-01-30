//7. Write a Java program to search for an element in an array list.
//8. Write a Java program to sort a given array list.
//9. Write a Java program to copy one array list into another.
//11. Write a Java program to reverse elements in an array list.

import java.util.*;
class ArrayListExercise4{

	public static void main(String args[]){
	
	List<String > li=new ArrayList<String >();

	li.add("Gaurav");
	li.add("Saurav");
	li.add("Maurav");
	li.add("Kaurav");

	System.out.println("Given collection is: "+li);

	
	//7th question ans
	
	System.out.println("is element present in list or not: "+li.contains("Maurav"));

	//8th question Ans
	Collections.sort(li);
	System.out.println("Sorted li collection :- "+li);

	//9th question ans  
	List<String>li2=new ArrayList<String>(li);         //other option is Collection.copy();
	System.out.println("Copied array into another: "+li2);
	
	//10 th Ans
	Collections.reverse(li);
	System.out.println("After array reversed :  "+ li);

}}