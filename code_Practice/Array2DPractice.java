import java.util.*;
class Array2DPractice{

	public static  void main(String [] args){
	
	Scanner sc=new Scanner(System.in);
	//2D arrays
	int [][] a=new int[3][4];
	




	//inserting values in array
	
	
	for(int i=0; i<=a.length-1; i++){
		for(int j=0; j<a[i].length; j++){
		System.out.println("Enter value for ["+i+"]["+j+"]");
		a[i][j]=sc.nextInt();
	}

}

	//Reading values of 2D arrys 

	System.out.println("Values of arrays are:");

	for(int n=0; n<a.length; n++){
		for(int m=0; m<a[n].length; m++){
			System.out.println("value of ["+n+"]["+m+"] :"+a[n][m]);
		}}

	}}