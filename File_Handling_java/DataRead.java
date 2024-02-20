
import java.io.*;

class DataRead{

	public static void main (String args []){
	//Reading data using Reader class 
	
	//code should be using try catch

	try{

	FileReader f=new FileReader("C:\\Users\\gdandekar\\Desktop\\GitRepoLocal\\JavaPractice\\File_Handling_java\\FileHandleData.txt");


	//FileReader return ascii value of charactor
	int n=f.read();

	//to return whole string used loops if not used it will return only one charactor 
	while(n!=-1){
	char ch=(char)n;
	System.out.print(ch);
	n=f.read();
}
	
	}catch(Exception e){
		System.out.println(e);

	}

		

}}