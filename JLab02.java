
class JLab02

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				22/09/2014
// Purpose : 			Program to calculate annual tax.
// *******************************************************************

{
	public static void main(String args[])
	{
		double annualincome;
		int noofchildren;
		double tax;
		
		System.out.print("Enter your annual income->");
		annualincome=EasyIn.getInt();
		System.out.print("Enter your number of children->");
		noofchildren = EasyIn.getInt();
		
		tax=(annualincome*0.24)-(5000+double(noofchildren)*1000);
		
		System.out.println("Annual tax is "+tax);
		
	}
}