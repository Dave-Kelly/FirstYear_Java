class JLab53

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				15/12/2014
/* Purpose : 			Modify the program at (2) so that it outputs the 
 *						number of words in the user's input, with the 
 *						average, minimum and maximum number of characters 
 *						in the words.
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
   		int maxChar ;
   		int minChar ;
   		int sum ;
   		double average ;
   		
   		minChar = 1 ;
		maxChar = 1 ;
		sum = 0 ;
		average = 0 ;
   		
   		System.out.print("Enter sentence ") ;
		sentence = EasyIn.getString() ;
		
		index = sentence.length()-1 ;
		numberOfWords = 0 ;
		alphaWord = 0 ;
		
		sentence = sentence.trim(); //Trim leading/trailing spaces
		sentence = " " + sentence ;
		//space = sentence.indexOf(" ") ;
		space = sentence.lastIndexOf(" ");
		//sentence = sentence.toUpperCase() ; //Convert to Upper to check alpha chars
		
		while(space > -1)
		{
			currentWord = sentence.substring(space + 1, sentence.length()) ;
			if(currentWord.length() > 0)
			{

				if(minChar > currentWord.length())
           			{
           				minChar = currentWord.length() ;		
           			}
           		else if(maxChar < currentWord.length())
           			{
           				maxChar = currentWord.length() ;	
           			}
				System.out.println("\n>>>" + currentWord + "<<<" ) ;
			}
			alphaWord++ ;
			sum = sum + currentWord.length() ;
           	average = (double)sum  / alphaWord ;
	   		sentence = sentence.substring(0, space) ;
   			space = sentence.lastIndexOf(" ") ;	
		}
		System.out.println("\nNumber of valid words = " + alphaWord) ;
		System.out.println("\nSmallest word = " + minChar + " characters") ;
		System.out.println("\nLargest word = " + maxChar + " characters") ;
		System.out.println("\nCharacter sum = " + sum + " characters") ;
		System.out.println("\nAverage Char/word = " + average + " characters") ;
		System.out.println("\n\n\n") ;
	}
}