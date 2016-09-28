
class JLab21

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				24/09/2014
// Purpose : 			Program to output whether a number is >0, <0 or ==0
// *******************************************************************



// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	int number1;  
	    		
		System.out.print("Enter an interger ->  "); 
		number1 = EasyIn.getInt();
		 
		if (number1 < 0)
			{
				System.out.println(number1 + "is less than 0");
			}
		else if (number1 > 0)
			{
				System.out.println(number1 + "is greater than 0");
			}
		else
			{
				System.out.println(number1 + "is equal to 0");
			}
    }
}

