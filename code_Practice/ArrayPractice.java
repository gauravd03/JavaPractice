
import java.util.*;

public class  ArrayPractice{
	public static void main(String args[]){

	Scanner sc=new Scanner (System.in);

	//one diementional array 
	int [] a=new int [5];
	
	//storing value
	System.out.println("Enter values for array");
	
	for(int i=0; i<=a.length-1; i++){
		System.out.println("Enter "+i+" integer value");
		a[i]=sc.nextInt();
		}

	//reading array

	System.out.println("Arrays elements are: ");
	for(int i=0; i<=a.length-1; i++){
		System.out.println(i +" index value is: "+ a[i]);
	}
	    

	//reading value using for each loop
	System.out.println("values reading using for each loop");
	
	Arrays.sort(a);
	for(int j:a){
	System.out.println("Value: "+j);
	}
	
}

}