
class JLab44

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				10/11/2014
/* Purpose : 			Write and test a program which will prompt the 
 						user to enter their name, read in the name, and 
 						write to the screen just the surname.
 						 
 						Modify the program produced in (1) so that it 
 						writes out the number of uppercase characters in 
 						the user's input.
 						
   *******************************************************************/


{
    public static void main(String[] args)
    {
  
    	String name ;
   		String firstName ;
   		String surName ;
   		String capitals ;
   		int space ;
   		int noOfChars ;
   		char firstInitial ;
   		char secondInitial ; 
   		int index ;
   		int upperCaseCount ;
   		
   		upperCaseCount = 0 ;
   		
    	System.out.print("Enter your name ") ;
		name = EasyIn.getString() ;
		space = name.indexOf(" ") ;
    	firstName = name.substring(0, space) ; 
    	surName = name.substring(space +1) ; 
    	firstInitial = name.charAt(0) ;
    	secondInitial = name.charAt(space +1) ;
    	
    	for (index = 0; index < name.length(); index++)
			{
	        	if (name.charAt(index)>= 'A' && name.charAt(index) <= 'Z'  )
			        {
			          upperCaseCount++; 
			        }
			} // for
			    	
		System.out.println("First name is " + firstName) ;	
		System.out.println("Surname is " + surName) ;	
		System.out.println("Initials are " + firstInitial + secondInitial) ;
		System.out.println("No of capital letters " + upperCaseCount) ;	
    }


}




















































































