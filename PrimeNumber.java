


class PrimeNumber{


	String primeCheck(int num){                                        //created method to check prime number
		int count=0;

		for(int i=2; i<num; i++){
			if(num%i==0){
				count++;
			}
		}

	if(count==1){
		return "not Prime";
	}else{
		return "Prime";
	}
		}




	public static void main(String args[]){

	PrimeNumber obj=new PrimeNumber();					//calling above method
		System.out.println(obj.primeCheck(11));
		

	
	

	
}}



		