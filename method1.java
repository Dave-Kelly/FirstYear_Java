
class method1

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				08/12/2014
/* Purpose : 			Value returning method template
   *******************************************************************/


{
	//Method that takes two int and returns largest or 0 if equal
	public static int largest(int theNum1, int theNum2)
	{
		int returnValue ;
		
		returnValue = 0 ;
		if(theNum1 > theNum2)
		{
			returnValue = theNum1 ;
		}
		else if(theNum2 > theNum1)
		{
			returnValue = theNum2 ;
		}
		
		return returnValue ;
	}
	
    public static void main(String[] args)
    {
  
    	int num1 ;
    	int num2 ;
    	int largest ;
    
    	System.out.print("Enter an integer ") ;
    	num1 = EasyIn.getInt() ;
    	System.out.print("Enter an integer ") ;
    	num2 = EasyIn.getInt() ;
    	
    	largest = largest(num1, num2) ;
    	
    	if(largest(num1, num2) == 0)
    	{
    		System.out.println("\n\nEQUAL") ;
    	}
    	else
    	{
    		System.out.println("\n\nLargest = " + largest) ;
    	}
		System.out.print("\n\n");
    	
    }

}




















































































