
class JLab46

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				24/11/2014
/* Purpose : 			Write and test a program which will prompt the 
 						user to enter their name, read in the name, and 
 						write to the screen just the surname.
 						 
 						Lab4 Complete
 						1 - 8
   *******************************************************************/


{
    public static void main(String[] args)
    {
  
    	String name ;
   		String firstName ;
   		String surName ;
   		String middleName ;
   		String capitals ;
   		int space1 ;
   		int space2 ;
   		int noOfChars ;
   		char firstInitial ;
   		char secondInitial ; 
   		int index ;
   		int upperCaseCount ;
   		String reverse ;
   		int occurence ;
   		
   		upperCaseCount = 0 ;
   		occurence = 0 ;
   		
    	System.out.print("Enter your name ") ;
		name = EasyIn.getString() ;
		//First space
		space1 = name.indexOf(" ") ;
		//Second space
		space2 = name.indexOf(" ", space1 + 1) ;
		
    	firstName = name.substring(0, space1) ;
    	middleName = name.substring(space1 + 1, space2) ; 
    	surName = name.substring(space2 +1) ; 
    	
    	firstInitial = name.charAt(0) ;
    	secondInitial = name.charAt(space2 +1) ;
    	
    	for (index = 0; index < name.length(); index++)
			{
	        	if (name.charAt(index)>= 'A' && name.charAt(index) <= 'Z'  )
			        {
			          upperCaseCount++; 
			        }
			} // for	
		
		for (index = 0; index < name.length(); index ++)
			{				       		
				if (name.charAt(index) == 'A' || name.charAt(index) == 'a')
					{
						occurence++ ;
					}
			}
		for(index = name.length() - 1; index >= 0; index--) 
    		{
    			System.out.print(name.charAt(index));
    		}	
		
			   			
   		//Another Way
		//reverse = new StringBuffer(name).reverse().toString() ;
		//System.out.println(reverse) ;
		
		    	
		System.out.println("\n\nFirst name is " + firstName) ;	
		System.out.println("\nSurname is " + surName) ;
		System.out.println("\nMiddle name is " + middleName	) ;	
		System.out.println("\nInitials are " + firstInitial + secondInitial) ;
		System.out.println("\nNo of capital letters " + upperCaseCount) ;	
		System.out.println("\n" + surName + " " + firstName) ;
		System.out.println("\nThe occurence of A is " + occurence + "\n\n") ;	
		
		System.out.print("\n\n");
    }


}




















































































