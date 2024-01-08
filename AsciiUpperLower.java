


class AsciiUpperLower{
		public static void main(String [] args){

			String str="Gaurav";
			int asc=0;

			for(int i=0; i<=str.length()-1; i++){              //logic : if charactor is greator than 90 then do minus 32 to convert upper case 

				asc=str.charAt(i);
				
				if(asc<=90){
					asc+=32;
					char ch=(char)asc;
					System.out.print(ch);
				}else if(asc>=90){
					asc-=32;
					char ch=(char)asc;
					System.out.print(ch);
				}
			}
		}}