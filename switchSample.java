class switchSample

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				19/01/2015
/* Purpose : 			Counts number of vowels in curret word.
   *******************************************************************/


{
    public static void main(String[] args)
    {

		int numDays;
		int year;
		 
		System.out.print("Enter month number ");
		month = EasyIn.getInt();
		System.out.print("Enter year");
		year = EasyIn.getInt();
		switch (month) 
			{
				case 1:
		        case 3:
		        case 5:
		      	case 7:
		        case 8:
		        case 10:
		        case 12:
		               	numDays = 31;
		                break;
		        case 4:
		        case 6:
		        case 9:
		        case 11:
		                numDays = 30;
		                break;
		        default:
		                numDays = 0;
		                break;
	          }
		System.out.println("Month number " + month + " in year " + year + " has " + numDays + " days");	
	}
}
