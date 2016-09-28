
class JLab24

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				29/09/2014
// Purpose : 			Write a program which ask the user for 3 numbers, it then indicates whether:
//						1. The first number is exactly divisible by both numbers.
//						2. The first number is exactly divisible by one of the 2 numbers.
//						3. The first number is not exactly divisible by either number.

// *******************************************************************


{
    public static void main(String[] args)
    {
    	int number1;
    	int number2;
    	int number3;
    	
    		
	    //Input		
		System.out.print("\n\tEnter the first number ->  "); 
		number1 = EasyIn.getInt();
		System.out.print("\n\tEnter the second number ->  "); 
		number2 = EasyIn.getInt();
		System.out.print("\n\tEnter the third number ->  ");
		number3 = EasyIn.getInt();
		
		
		//Output 
		if (number1 % number2 == 0 && number1 % number3 ==0)
			{
				System.out.println("\n\tThe first number is exactly divisible by both numbers.");
			}
		else if (number1 % number2 == 0 )
			{
				System.out.println("\n\tThe first number is divisible by the secoond number but not the third.");
			}
		else if (number1 % number3 == 0)
			{
				System.out.println("\n\tThe first number is divisible by the third number but not the second.");
				
			}
		else
			{	
				System.out.println("\n\tThe first number is not exactly divisble by either numbers.");
			}
    }
}

