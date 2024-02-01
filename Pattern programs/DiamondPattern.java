class DiamondPattern{

	public static void main (String args[]){

	int num=5;

	//code for upper triangle
	for(int i=0; i<=num; i++){
		for(int j=i; j<=num; j++){
			System.out.print(" ");

		}	
		
		for(int k=1; k<=i; k++){
			System.out.print(" *");
		}
		
		System.out.println();
	}

	//code for lower inverted triangle
		for(int m=0; m<=num; m++){
		for(int l=1; l<=m; l++){
			System.out.print(" ");

		}	
		
		for(int s=m; s<=num; s++){
			System.out.print(" *");
		}
		
		System.out.println();
	}


}}