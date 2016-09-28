
class JLab43

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				10/11/2014
/* Purpose : 			Write and test a program which will prompt the 
 						user to enter their name, read in the name, and 
 						write to the screen just the surname.
 						 
 						Modify the program produced in (1) so that it 
 						writes out the number of characters in the user's 
 						input.
 						
   *******************************************************************/


{
    public static void main(String[] args)
    {
  
    	String name ;
   		String firstName ;
   		String surName ;
   		int space ;
   		int noOfChars ; 
   		
    	System.out.print("Enter your name ") ;
		name = EasyIn.getString() ;
		noOfChars = name.length() ;
		
		space = name.indexOf(" ") ;
    	firstName = name.substring(0, space) ; 
    	surName = name.substring(space +1) ; 
		System.out.println("Your first name is " + firstName) ;	
		System.out.println("Your surname is " + surName) ;	
		System.out.println("No of characters is " + noOfChars) ;
    }


}




















































































