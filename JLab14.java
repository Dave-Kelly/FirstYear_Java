
class JLab14

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				22/09/2014
// Purpose : 			Program to calculate sum, product and average of three numbers. (Modified)
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
		
		sum=number1;
		product=number1;
		average=number1;
		
		System.out.println("Total sum" + sum);
		System.out.println("Total product" + product);
		System.out.println("Average" + average);
		
		System.out.print("Enter the second number->");
		number2=EasyIn.getInt();
		
		sum=number1+number2;
		product=number1*number2;
		average=sum/2;
		
		System.out.println("Total sum" + sum);
		System.out.println("Total product" + product);
		System.out.println("Average" + average);
		
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