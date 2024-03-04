class Calculate_Avg{
	public static void main(String args[]){

	int [] num={2,3,5,76,45};
	int sum=0;
	
	for(int a:num){
	sum+=a;
	}

	double avg=sum/num.length;
	System.out.println("Average is : " +avg);


	//System.out.println("");

}
}