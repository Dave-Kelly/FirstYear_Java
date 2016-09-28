class Addition

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				22/09/2014
// Purpose : 			A simple addition program
// *******************************************************************

{
	public static void main(String args[])
	{
		int number1;
		int number2;
		int answer;
		
		System.out.print("Enter the first number->");
		number1=EasyIn.getInt();
		System.out.print("Enter the second number->");
		number2=EasyIn.getInt();
		answer=number1+number2;
		System.out.println("The sum of the two numbers is "+answer);
		
	}
}