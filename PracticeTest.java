
class PracticeTest

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				01/10/2014
// Purpose : 			Program outputs the lowest number.
// *******************************************************************


{
    public static void main(String[] args)
    {
  
    	int index ;
    	int noOfNames ;
    	int currentAge ;
    	String currentName ;
		int oldest ;
		String eldestName ; 
			
		oldest = 0 ; 
		eldestName = "" ;
    	
	    //Input	
	    System.out.print("How many people? ->  "); 
		noOfNames = EasyIn.getInt();
		
		for(index = 1; index <= noOfNames; index++)
			{
				System.out.print("Enter name " + index + " ");
				currentName = EasyIn.getString();
				System.out.print("Enter age " + index + " ");
				currentAge = EasyIn.getInt();
				if(currentAge > oldest)	
					{
						oldest = currentAge ;
						eldestName = currentName ;
					}
			}
			
		System.out.println("The oldest person is " + eldestName + " at " + oldest + " years old.");
    }
}

