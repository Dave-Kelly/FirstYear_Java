
class JLab31

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				20/10/2014
/* Purpose : 			Write a following program using a loop
 						structure of your choice. The program keeps presenting
 						the user with options until the user enters the value 7 to exit

						1.	Fahrenheit to celcius
						2.	Celcius to Fahrenheit
						3.	Inches to centimetres
						4.	Centimetres to inches
						5.	Pounds to Kilograms
						6.	Kilograms to Pounds
						7.	Exit Program

   *******************************************************************/


{
    public static void main(String[] args)
    {
  
  		int index = 1;
    	double input ;
    	double output ;
    	String menu ; 
    
    	while (index <= 6)
   			{
   				menu =  "1:Inches to centimetres \n\n" ;
		    	menu += "2:Centimetres to Inches \n\n" ;
		    	menu += "3:Fahrenheit to celcius \n\n" ;
		    	menu += "4:Celcius to Fahrenheit \n\n" ;
		    	menu += "5:Pounds to Kilograms \n\n" ;
		    	menu += "6:Kilograms to Pounds \n\n" ;
		    	menu += "7:Exit Program \n\n" ;
		    	menu += "Enter menu option (1-6) ";
   				System.out.print(menu) ;
   				
   				index = EasyIn.getInt() ;
   				
   				switch(index)
				{
		   			case 1: //Inches to centimentre
						System.out.print("\n\nEnter your value in inches->");
						input=EasyIn.getDouble();
				
						output = input * 2.54;
				
						System.out.println("\n\nThe value in centimetre is "+ output);
		             		break;
		   			case 2: //Centimetre to inches
						System.out.print("\n\nEnter your value in centimetre->");
						input=EasyIn.getDouble();
				
						output = input * 0.393701;
				
						System.out.println("\n\nThe value in inches is "+ output);
		             		break;
		   			case 3: //Fahreheit to celcius
						System.out.print("\n\nEnter your value in fahrenheit->");
						input=EasyIn.getDouble();
				
						output = (input - 32) * 5 / 9;
				
						System.out.println("\n\nThe value in celcius is "+ output);
		             		break;
		            case 4: //Celcius to fahrenheit
						System.out.print("\n\nEnter your value in celcius->");
						input=EasyIn.getDouble();
				
						output = input * 9/5 + 32;
				
						System.out.println("\n\nThe value in fahrenheit is "+ output);;
		             		break;
		            case 5: //Pound to kilo
						System.out.print("\n\nEnter your value in pounds->");
						input=EasyIn.getDouble();
				
						output = input * 0.453592;
				
						System.out.println("\n\nThe value in kilograms is "+ output);
		             		break;
		            case 6: //Kilo to pound
						System.out.print("\n\nEnter your value in kilograms->");
						input=EasyIn.getDouble();
				
						output = input * 2.20462;
				
						System.out.println("\n\nThe value in pound is "+ output);
							break;	
				}
   			}	

		
    }
}






















































































