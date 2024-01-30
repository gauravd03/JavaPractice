//12. Write a Java program to extract a portion of an array list.
//14. Write a Java program that swaps two elements in an array list.
//15. Write a Java program to join two array lists.
//16. Write a Java program to clone an array list to another array list.
//17. Write a Java program to empty an array list.
//18. Write a Java program to test whether an array list is empty or not.


import java.util.*;
class ArrayListExercise5{

	public static void main(String args[]){
	
	List<String > li=new ArrayList<String >();

	li.add("red");
	li.add("Green");
	li.add("black");
	li.add("voilet");

	//12th quetions an
	
	System.out.println("Sublist of list : "+ li.subList(0,2));


	//14th questions ans
	
	Collections.swap(li,1,3);
	System.out.println("List after swaping 1 and 3rd element: "+li);

	//15th quetions ans 

	List<String > li2=new ArrayList<String >();

	li.add("yellow");
	li.add("orange");
	li.add("pink");
	li.add("chocolate");

	li.addAll(li2);
	
	System.out.println("List after joinn two list :"+ li);

	//16th queation ans
	List <String > li3=new ArrayList<String >();
	System.out.println("After cloning one list to new list: "+li3);
	
	
	//17th Questions ans

	li.clear();
	System.out.println("li list after performing empty opration: "+li);


	//18th Question ans
	li3.add("namasteaa");
	System.out.println("Checking is list empty or not: "+ li3.isEmpty());


	
}}