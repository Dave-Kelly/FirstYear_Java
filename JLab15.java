
class JLab15

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				22/09/2014
// Purpose : 			Program to calculate the total repayment of a loan.
// *******************************************************************

{
	public static void main(String args[])
	{
		double loan;
		double interestrate ;
		double years;
		double annualinterest;
		double total;
		
		System.out.print("Enter the total amount loaned->");
		loan=EasyIn.getInt();
		System.out.print("Enter the annual interest rate->");
		interestrate=EasyIn.getInt();
		System.out.print("Enter the amount of years the loan was taken out for->");
		years = EasyIn.getInt();
		
		annualinterest = loan * interestrate / 100 ;
		total = loan + annualinterest * years ;
		
		
		System.out.println("\n\tThe annual interest rate is " + annualinterest) ;
		System.out.println("\n\tThe total amount repaid is "+total);
		
	}
}