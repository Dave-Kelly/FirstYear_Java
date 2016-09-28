
class JLab51

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				08/12/2014
/* Purpose : 			Write a program which will input a string from 
 						the keyboard, and output the number of separate 
 						words, where a word is one or more characters 
 						separated by spaces. Your program should only 
 						count as words, groups of characters in the ranges 
 						A..Z and a..z
   *******************************************************************/


{
    public static void main(String[] args)
    {
  
    	String sentence ;			//User Input
    	String currentWord ;
    	int alphaWord ;				//Valid Words
   		int index ;
   		int space ;
   		int numberOfWords ;
   		int charCount ;
   		
		index = 0 ;
		numberOfWords = 0 ;
		alphaWord = 0 ;
		
   		System.out.print("Enter sentence ") ;
		sentence = EasyIn.getString() ;
		
		sentence = sentence.trim() + " " ; //Trim leading/trailing spaces, add space for last word
		space = sentence.indexOf(" ") ;
		sentence = sentence.toUpperCase() ; //Convert to Upper to check alpha chars
		
		while(space > -1)
		{
			currentWord = sentence.substring(0,space) ;
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
   			
   			
   			sentence = sentence.substring(space + 1) ;
   			space = sentence.indexOf( " ") ;				 		  				
   		}
   			
   		System.out.println("\n\nNumber of valid words -> " + alphaWord) ;
		System.out.print("\n\n");
    	
    }

}




















































































