
class JLab2b4

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				06/10/2014
// Purpose : 			Program outputs number from lowest to highest.
// *******************************************************************


{
    public static void main(String[] args)
    {
  
    	int number1 ;
		int number2 ;
		int number3 ;
		int minimum ;
		int maximum ;
		int middle ;
    	
    		
	    //Input		
		System.out.print("Please the first integer ->  "); 
		number1 = EasyIn.getInt();
		System.out.print("Please the second integer ->  "); 
		number2 = EasyIn.getInt();
		System.out.print("Please the third integer ->  "); 
		number3 = EasyIn.getInt();
		
		
		//Calculation
		if (number1 < number2 && number1 < number3)
			{
				minimum = number1   ;
			}
		else if (number2 < number1 && number2 < number3)
			{
				minimum =  number2 ;
			}
		else
			{
				minimum = number3  ;
			}
		
		
		if (number1 > number2 && number1 > number3)
			{
				maximum = number1   ;
			}
		else if (number2 > number1 && number2 > number3)
			{
				maximum =  number2 ;
			}
		else
			{
				maximum = number3  ;
			}
			
		
		if (number1 > minimum && number1 < maximum)
			{
				middle = number1   ;
			}
		else if (number2 > minimum && number2 < maximum)
			{
				middle =  number2 ;
			}
		else
			{
				middle = number3  ;
			} 
		
		//Output
			System.out.println("\n\nThe lowest number is: " + minimum + " - " + middle + " - " + maximum + "\n\n");
		
    }
}

