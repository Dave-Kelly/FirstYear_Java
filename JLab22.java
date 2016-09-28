
class JLab22

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				29/09/2014
// Purpose : 			Program to calculate exam results
// *******************************************************************



// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	double programMark;
    	double mathMark;
    	double hardwareMark;
    	double average;  
	    		
	    		
	    //Input		
		System.out.print("Enter the exam mark for Programming ->  "); 
		programMark = EasyIn.getDouble();
		System.out.print("\n\tEnter the exam mark for Math -> ");
		mathMark = EasyIn.getDouble();
		System.out.print("\n\tEnter the exam mark for Hardware -> ");
		hardwareMark = EasyIn.getDouble();
		
		
		//Calculate Average Mark
		average = (programMark + mathMark + hardwareMark) / 3; 
		
		//Distinction		70 - 100
		//Merit1			63 - 69
		//Merit2			55 - 62
		//Pass				40 - 54
		//Fail				Less Than 40
		 
		if (average < 40)
			{
				System.out.println("\n\tFail");
			}
		else if (average <= 54)
			{
				System.out.println("\n\tPass");
			}
		else if (average <= 62)
			{
				System.out.println("\n\tMerit2");
			}
		else if (average <=69)
			{
				System.out.println("\n\tMerit1");
			}
		else
			{
				System.out.println("\n\tDistinction");
			}
    }
}

