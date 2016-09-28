
class JLab2b2

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				29/09/2014
// Purpose : 			Program which calculates credit card interesT
// *******************************************************************


{
    public static void main(String[] args)
    {
    	final double INTEREST1 = 0.12;
    	final double INTEREST2 = 0.18;
    	
    	double amount1;
		double amount2;
		double amount3;
		double totalInterest;
    	
    		
	    //Input		
		System.out.print("Please input your credit card value ->  "); 
		amount1= EasyIn.getInt();
		
		//Calculation
		
		amount2 = 500 * INTEREST1;
		amount3 = (amount1 - 500) * INTEREST2;
		totalInterest = amount2 + amount3;
		
		
		
		
		//Output 
		System.out.println("Total interest charge is -> " + totalInterest);

    }
}

