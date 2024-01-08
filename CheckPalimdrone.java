

class CheckPalimdrone{
		public static void main (String [] args){
			int num=232;
			int temp=num;
			int rev=0;
			int ld=0;


			while(temp!=0){
				ld=temp%10;
				rev=rev*10+ld;
				temp=temp/10;
				}

			if(rev==num){
			System.out.println("palimdrome number");
			}else{
				System.out.println("Not Palimdrome number");
		}
		}}