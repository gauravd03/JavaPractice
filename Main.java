public class Main
{
	public static void main(String[] args) {
	    
	    String str="Gaurav Dandekar";
	    
	    String [] str1=str.split(" ");
	    for(String a: str1){
	        System.out.println(a);
	    }
	    
	      for(int i=0; i<=str1.length-1; i++){
	          StringBuffer buffer=new StringBuffer(str1[i]);
	         System.out.println( buffer.reverse());
	          
	        
	    }
	    
	    
	  
	    
			
	}
	}
