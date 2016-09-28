
class JLab47

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				19/11/2014
/* Purpose :			Program to find occurence of letter 
 						in users input.
   *******************************************************************/


{
    public static void main(String[] args)
    {
  
    	String phrase ;
   		int index ;
   		int occurence ;
   		char searchChar ;
   		
   		occurence = 0 ;
   		
    	System.out.print("Enter a phrase: ") ;
		phrase = EasyIn.getString() ;
		System.out.print("Enter the letter you are searching for: ") ;
		searchChar = EasyIn.getChar() ;
		
		//Convert String and SearchChar to upper case.
		searchChar = Character.toUpperCase(searchChar) ;
		phrase = phrase.toUpperCase() ;
		
		for (index = 0; index < phrase.length(); index ++)
			{				       		
				if (phrase.charAt(index) == searchChar)
					{
						occurence++ ;
					}
			} 	
		
		System.out.println("\nThe occurence of " + searchChar + " is " + occurence + "\n\n") ;	
		
		System.out.print("\n\n");
    }


}




















































































