
class JLab42

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				10/11/2014
/* Purpose : 			Write and test a program which will prompt the 
 						user to enter their name, read in the name, and 
 						write to the screen just the surname.
   *******************************************************************/


{
    public static void main(String[] args)
    {
  
    	String name ;
   		String firstName ;
   		int space ; 
   		
    	System.out.print("Enter your name ") ;
		name = EasyIn.getString() ;
		space = name.indexOf(" ");
    	firstName = name.substring(0, space); 
		System.out.println("Your first name is " + firstName);	
    }


}




















































































