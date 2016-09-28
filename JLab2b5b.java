
class JLab2b5b

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				06/10/2014
// Purpose : 			Write a program that takes as input the number 
//						of a month and outputs the name of that month.
//						** Switch Statement ** 
// *******************************************************************


{
    public static void main(String[] args)
    {
  
    	int month;
 
	System.out.print("Enter the month number... ");
 	month = EasyIn.getInt();
	switch(month) 
		{
   			case 1: 
				System.out.println("\nJanuary");
             		break;
   			case 2: 
				System.out.println("\nFebruary");
             		break;
   			case 3: 
				System.out.println("\nMarch");
             		break;
            case 4: 
				System.out.println("\nAril");
             		break;
            case 5: 
				System.out.println("\nMay");
             		break;
            case 6: 
				System.out.println("\nJune");
             		break;
            case 7: 
				System.out.println("\nJuly");
             		break;
             case 8: 
				System.out.println("\nAugust");
             		break;
            case 9: 
				System.out.println("\nSeptember");
             		break;
            case 10: 
				System.out.println("\nOctober");
             		break;
            case 11: 
				System.out.println("\nNovember");
             		break;
            case 12: 
				System.out.println("\nDecember");
             		break;
   			default:  
				System.out.println("\n\nInvalid Option!");
 		}

		
    }
}

