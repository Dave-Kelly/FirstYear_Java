class JLab52

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				15/12/2014
/* Purpose : 			Modify the program at (2) so that it outputs 
 						the words input by the user in reverse order 
 						(2This word is 3 chars"   becomes "chars 3 is word This")
   *******************************************************************/


{
    public static void main(String[] args)
    {
  
    	String sentence ;
    	String currentWord ;
    	int alphaWord ;
   		int index ;
   		int space ;
   		int numberOfWords ;
   		int charCount ;
   		
   		System.out.print("Enter sentence ") ;
		sentence = EasyIn.getString() ;
		
		index = sentence.length()-1 ;
		numberOfWords = 0 ;
		alphaWord = 0 ;
		
		sentence = sentence.trim(); //Trim leading/trailing spaces
		sentence = " " + sentence ;
		//space = sentence.indexOf(" ") ;
		space = sentence.lastIndexOf(" ");
		sentence = sentence.toUpperCase() ; //Convert to Upper to check alpha chars
		
		while(space > -1)
		{
			currentWord = sentence.substring(space + 1, sentence.length()) ;
			if(currentWord.length() > 0)
			{
				System.out.println("\n>>>" + currentWord + "<<<" ) ;
			}
			
			//Check word is valid
	   		charCount = 0 ;
	   		for (index = 0; index < currentWord.length(); index++)  
	   		{
   				if (currentWord.charAt(index) >= 'A' && currentWord.charAt(index) <= 'Z')
   				{
   					charCount++ ; //Count alpha characters
   				}
   		
   			} // for
   			
   			if (currentWord.length() == charCount && currentWord.length() > 0) 
   				{
   					alphaWord++ ;
   				}
			
	   		sentence = sentence.substring(0, space) ;
   			space = sentence.lastIndexOf(" ") ;	
		}
		System.out.println("\nNumber of valid words = " + alphaWord) ;
		System.out.println("\n\n\n") ;
	}
}