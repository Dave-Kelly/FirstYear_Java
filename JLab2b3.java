
class JLab2b3

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				01/10/2014
// Purpose : 			Program outputs the lowest number.
// *******************************************************************


{
    public static void main(String[] args)
    {
  
    	int number1 ;
		int number2 ;
		int number3 ;
		int minimum ;
    	
    		
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
		
		//Output
		System.out.println("The lowest number is: " + minimum );
    }
}

