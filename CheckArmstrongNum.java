 class CheckArmstrongNum{
	public static void main(String args[]){

		int num=1533;
 		int temp=num;
		int ld=0;
		int armsnum=0;

		while(temp!=0){
			ld=temp%10;
			armsnum=(ld*ld*ld)+armsnum;

			temp=temp/10;
			}
		
		if(armsnum==num){
		System.out.println("yes, armstrong number");
		}else{
		System.out.println("not a armstrong number");

		}
}}