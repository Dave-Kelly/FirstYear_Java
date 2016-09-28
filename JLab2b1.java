
class JLab2b1

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				29/09/2014
// Purpose : 			Program which calculates the insurance premium for the coming year. 
// *******************************************************************


{
    public static void main(String[] args)
    {
    	final double INCREASE = 0.05;
    	final double DISCOUNT = 0.4;
    	final double PENALTY = 0.2;
    	
    	double lastYearPremium;
    	double numberOfClaims;
    	double premium;
    	double discountPremium;
    	double penaltyPremium;
    	
    		
	    //Input		
		System.out.print("The last years premium ->  "); 
		lastYearPremium = EasyIn.getInt();
		System.out.print("Enter number of claims ->  "); 
		numberOfClaims = EasyIn.getInt();
		
		//Calculation
		
		premium = lastYearPremium + (lastYearPremium * INCREASE);
		penaltyPremium = premium + ((premium * PENALTY) * numberOfClaims);
		discountPremium = premium - (premium * DISCOUNT);
		
		
		
		
		//Output 
		if (numberOfClaims == 0)
			{
				System.out.println("Your new insurance premium is  -> " + discountPremium);
			}
		else if (numberOfClaims > 0 )
			{
				System.out.println("Your new insurance premium is -> " + penaltyPremium);
			}
    }
}

