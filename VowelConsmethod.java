class VowelConsmethod

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				28/01/2015
/* Purpose : 			Program which takes a sentence (i.e. string of 
 						words separated by single spaces) as input, and 
 						prints out various statistics about the sentence. 
   *******************************************************************/

{

	public static void main(String[] args)
	{
	  	String sentence = "The quick brown fox jumps over the lazy dog" ;
	  	String currentWord ;
	  	String result ; //Final output (word with equal number of vowels and consonants.
	  	int index ;
	  	int space ;
	  	int vowelCount ;
	  	int consonantCount ;
	  
	  	result = "";
	  	vowelCount = 0 ;
	  	consonantCount = 0 ;
	  	
	  	sentence = sentence.trim() + " " ; //Trim leading/trailing spaces, add space for last word
		space = sentence.indexOf(" ") ;
	  	
	  	while(space > -1)
		{
			currentWord = sentence.substring(0,space) ;
			if(currentWord.length() > 0)
			{
			  	currentWord = currentWord.toLowerCase();
			   
			 	for (index = 0; index < currentWord.length(); index++)
			    	{
			    		switch (currentWord.charAt(index))
			    			{
						    	case 'a':
						    	case 'e':
						   		case 'i':
						   		case 'o':
						   		case 'u':
							    		vowelCount++;
							    		break;					    		
							    default: 
							    		consonantCount++;
							    		break;
			    			}
			    		if(vowelCount == consonantCount)
			    			{
			    				result = currentWord ;
			    			}
			   		 }	  	
			  
			 }
			sentence = sentence.substring(space + 1) ;
   			space = sentence.indexOf(" ") ;	
   		}
			
   	
		System.out.println("The smallest word with an equal number of vowels and consonants is -> " + result) ;		
	} 
	
}
