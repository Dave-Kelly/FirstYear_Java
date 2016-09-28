
class JLab33

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				30/10/2014
/* Purpose : 			Write a program to read a list of integer values 
 						which will find and display the index of the first 
 						occurrence and the last occurrence of the number 12. 
						Your program should print the Index values of 0 (zero) 
 						if the number 12 is not found.
   *******************************************************************/


{
    public static void main(String[] args)
    {
  
    	int index ;
    	int numberOfValues ;
    	int currentNumber ;
    	int firstOcc ;
  		int lastOcc ;
    	
    	firstOcc = 0 ;
    	lastOcc = 0 ;
    
    	System.out.print("How many numbers?  ") ;
		numberOfValues = EasyIn.getInt() ;	
    	for (index = 1; index <= numberOfValues; index ++)
	   		{
	       		System.out.print("Enter number " + index + "  " ) ;
				currentNumber = EasyIn.getInt() ;
				if (currentNumber == 12)
					{
						if (firstOcc == 0)
						 	{
						 		firstOcc = index ;
						 	}
						lastOcc = index ;	
			   		}
			 }
   		if (lastOcc == 0) 
   			{
   				System.out.println("No 12s entered");
   			}	
   		else
   			{
   				System.out.println("The first occurrence of 12 was at index position " + firstOcc);
   				System.out.println("The last occurrence of 12 was at index position " + lastOcc);	
   			}
		
		
    }
}






















































































