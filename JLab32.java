
class JLab32

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				30/10/2014
/* Purpose : 			Write a program that will find the sum of a 
 						collection of data values. Your program should 
 						terminate when a zero value is read.
   *******************************************************************/


{
    public static void main(String[] args)
    {
  
    	int userInput ;
    	int sum ;
    	int smallest ;
    	int largest ;
    	int place ;
    	double average ;
    	
    	sum = 0 ;
    	place = 1 ;
    	average = 0 ;
    	
    	System.out.print("Enter a number or 0 to quit ") ;
		userInput = EasyIn.getInt() ;
		smallest = userInput ;
		largest = userInput ;	
    	while (userInput != 0)
   			{
           		if(smallest > userInput)
           			{
           				smallest = userInput ;
           			}
           		else if(largest < userInput)
           			{
           				largest = userInput ;
           			}
           		
           		
           		sum = sum + userInput ;
           		average = sum / place ;
           		
           		place++ ;
           		System.out.print("Enter a number or 0 to quit ") ;
				userInput= EasyIn.getInt();	
			}
		System.out.println("Smallest => " + smallest) ;	
		System.out.println("Largest => " + largest) ;	
		System.out.println("Sum => " + sum) ;
		System.out.println("Average => " + average) ;	
    }
}






















































































