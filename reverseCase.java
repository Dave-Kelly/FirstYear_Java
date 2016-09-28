
class reverseCase

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				10/11/2014
/* Purpose : 			Write a method that inverts the case of user's
 						input. Call the method in the main method.
   *******************************************************************/


{
	public static String reverseCase(String theString)
	{
		int index ;
		String resultString ;
		char currentChar ;
		
		resultString = "" ;
		index = 0 ;
		
		for(index = 0 ; index < theString.length() ; index++)
			{
				currentChar = theString.charAt(index);
				if(currentChar >= 'a' && currentChar <= 'z')
				{
					currentChar = Character.toUpperCase(currentChar);
					resultString = resultString + currentChar;
				}
				else if(currentChar >= 'A' && currentChar <= 'Z')
				{
					currentChar = Character.toLowerCase(currentChar);
					resultString = resultString + currentChar;
				}
			}
		return resultString ;
		
		
		
	}
    public static void main(String[] args)
    {
  
    	String sentence ;
   		
    	System.out.print("Enter string ") ;
		sentence = EasyIn.getString() ;
		System.out.println("\n\nInput with case inverted " + reverseCase(sentence) + "\n\n");	
    }


}




















































































