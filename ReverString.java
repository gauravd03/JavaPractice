class ReverString{

	public static void main(String args []){
	
	String str="Gaurav Dandekar";
	
	StringBuffer buffer=new StringBuffer(str);
	System.out.println("String reverse using buffer : "+buffer.reverse());

	String str1="Priyanshu";
	
	for(int i=str1.length()-1; i>=0; i--){
		System.out.print(str1.charAt(i));
	}

	}}