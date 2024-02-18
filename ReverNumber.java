import java.util.*;
class ReverNumber{

	public static void main(String args []){

	Scanner sc=new Scanner(System.in);

	int num=sc.nextInt();
	int temp=num;
	int ld=0;
	int rev=0;
	

	while(temp!=0){

	ld=temp%10;
	rev=(rev*10)+ld;
	temp=temp/10;
	}

	System.out.println(rev);

	
	



}}