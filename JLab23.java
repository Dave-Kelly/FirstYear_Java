
class JLab23

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				29/09/2014
// Purpose : 			Program to check if an integer is odd or even
// *******************************************************************



// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	int number1;
    	
    		
	    //Input		
		System.out.print("Enter an integer to check if it's odd or even ->  "); 
		number1 = EasyIn.getInt();
		
		
		
		//Output 
		if ((number1 % 2 == 0)
			{
				System.out.println("Even");
			}
		else
			{
				System.out.println("Odd");
			}
    }
}

