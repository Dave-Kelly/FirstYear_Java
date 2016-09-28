class vowelCount

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				19/01/2015
/* Purpose : 			Counts number of vowels in curret word.
   *******************************************************************/


{
	//METHOD -> VOWEL COUNT 
    public static void main(String[] args)
    {
	  	int index ;
	  	int vowelCount ; 
	  	String currentWord = "ABcdeFGHIJKLMNOPqrstuvwXYZ" ;
	  	
	  	vowelCount = 0 ;
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
					    		break;
	    			}
	   		 }
	   		 
	   	System .out.println(vowelCount);
	  }
  

}




