
class JLab11

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				22/09/2014
// Purpose : 			Program to convert inches to centimetre
// *******************************************************************

{
	public static void main(String args[])
	{
		double inch;
		double centimetre;
		
		System.out.print("Enter your value in inches->");
		inch=EasyIn.getInt();
		
		centimetre=inch*2.54;
		
		System.out.println("The value in centimetre is "+centimetre);
		
	}
}