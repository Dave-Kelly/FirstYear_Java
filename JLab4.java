
class JLab4

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				10/11/2014
/* Purpose : 			Write and test a program which will prompt the 
 						user to enter their name, read in the name, and 
 						write to the screen just the surname.
 						 
 						(Where surname is interpreted as everything after 
 						the first space).
   *******************************************************************/


{
    public static void main(String[] args)
    {
  
    	String name ;
   		String surName ;
   		int spacePos ; 
   		
    	System.out.print("Enter your name ") ;
		name = EasyIn.getString() ;
		spacePos = name.indexOf(" ");
    	surName = name.substring(spacePos + 1); 
		System.out.println("The surname is " + surName);	
    }


}




















































































