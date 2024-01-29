class ReverseArray{

	public static void main(String args[]){
	
	int [] array={1,2,3,4,5,6};
	
	int i=0;              //start point of array
	int j=array.length-1; //end point of array 

	//here we will swap start and end point for arrys

	
	while(i<j){
		 int temp=array[i];      //this is simple swapping of two numbers
		array[i]=array[j];
		array[j]=temp;
		i++;
		j--;
		}


	//printing reversed array

	for(int k=0; k<array.length; k++){
		System.out.print(array[k]);
}
}}
