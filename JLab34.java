
class JLab34

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				10/11/2014
/* Purpose : 			Write a program to find the largest, smallest 
 						and average value in a collection of N numbers. 
 						
 						Modify the above program so that it tells the 
 						user if the highest or lowest number has been 
 						entered more than once, and if so how many times.
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
    	int smallestOcc ;
    	int largestOcc ;
    	
    	sum = 0 ;
    	place = 1 ;
   
    	System.out.print("Enter a number or 0 to quit ") ;
		userInput = EasyIn.getInt() ;
		smallest = userInput ;
		largest = userInput ;
		largestOcc = 1 ;
		smallestOcc = 1 ;
    	while (userInput != 0)
   			{
           		if(smallest == userInput)
           			{
           			
           				smallestOcc++ ;
           			}
           		
           		else if(smallest > userInput)
           			{
           				smallest = userInput ;
           				smallestOcc = 1 ;
           							
           					
           			}
           		else if(largest == userInput)
           			{
           				largestOcc++ ;
           			}
           		else if(largest < userInput)
           			{
           				largest = userInput ;
           				largestOcc = 1 ;
           			}
           		
           		sum = sum + userInput ;
           		average = (double)sum  / place   ;
           		
           	System.out.println("Smallest => " + smallest) ;	
			System.out.println("Largest => " + largest) ;	
			System.out.println("Sum => " + sum) ;
			System.out.println("Average => " + average + "\n\n") ;
			System.out.println("The smallest was entered => " + smallestOcc + " times \n\n") ;
			System.out.println("The smallest was entered => " + largestOcc + " times \n\n") ;
           		
           		place++ ;
           		System.out.print("Enter a number or 0 to quit ") ;
				userInput= EasyIn.getInt();	
			}
			
		
    }


}




















































































