
class JLab13

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				22/09/2014
// Purpose : 			Program to calculate sum, product and average of three numbers. 
// *******************************************************************

{
	public static void main(String args[])
	{
		double number1;
		double number2;
		double number3;
		double sum;
		double product;
		double average;
		
		System.out.print("Enter the first number->");
		number1=EasyIn.getInt();
		System.out.print("Enter the second number->");
		number2=EasyIn.getInt();
		System.out.print("Enter the third number->");
		number3=EasyIn.getInt();
		
		sum=number1+number2+number3;
		product=number1*number2*number3;
		average=sum/3;
		
		
		System.out.println("The sum of the three numbers is" + sum);
		System.out.println("The product of the three number is" + product);
		System.out.println("The average of the three number is" + average);
		
	}
}