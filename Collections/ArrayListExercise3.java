//3. Write a Java program to insert an element into the array list at the first position.
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
//5. Write a Java program to update an array element by the given element.
//6. Write a Java program to remove the third element from an array list.


import java.util.*;
class ArrayListExercise3{

	public static void main(String args[]){
	
	List<Integer> li=new ArrayList<Integer>();

	li.add(1);
	li.add(2);
	li.add(3);
	li.add(4);


	System.out.println("Given collection :"+li);

	//3rd question Ans
	System.out.println("element added at first position 7");
	li.add(0,7);
	
	//4th question Ans
	//System.out.println("Element retrived from given index: "+li.get(3));
	

	//5th question Ans
	li.set(2,8);
	System.out.println("3rd element set to 8 :"+li);

	//6th question Ans
	li.remove(3);
	System.out.println("3rd element removed :"+li);

	


	



 


}

}