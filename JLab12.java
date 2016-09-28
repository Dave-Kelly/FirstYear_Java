
class JLab12

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				22/09/2014
// Purpose : 			Program to calculate miles/hour and miles/gallon
// *******************************************************************

{
	public static void main(String args[])
	{
		double distance;
		double time;
		double petrol;
		double milesperhour;
		double milespergallon;
		
		System.out.print("Enter the distance travelled in miles->");
		distance=EasyIn.getInt();
		System.out.print("Enter the time spent travelling in hours->");
		time=EasyIn.getInt();
		System.out.print("Enter the amount of petrol used in gallons->");
		petrol=EasyIn.getInt();
		
		milesperhour=distance/time;
		milespergallon=distance/petrol;
		
		
		//The average miles per hour is +miles per hour
		//The average miles per gallon is +miles per gallon
		System.out.println("The average miles travelled per hour is "+milesperhour);
		System.out.println("The average miles travelled per gallon is "+milespergallon);
		
	}
}