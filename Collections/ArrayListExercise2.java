//2. Write a Java program to iterate through all elements in an array list.


import java.util.*;
class ArrayListExercise2{

	public static void main(String args[]){
	
	List<Integer> li=new ArrayList<Integer>();

	li.add(1);
	li.add(2);
	li.add(3);
	li.add(4);

	System.out.println("element printed using for each loop");

	for(int a:li){
	System.out.println(a);
	}



	System.out.println("Element printed using iterator");

	Iterator it=li.iterator();

	while(it.hasNext()){
	System.out.println(it.next());
	}


}

}