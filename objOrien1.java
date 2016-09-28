
class objOrien1

// Student Name : 		David Kelly
// Student Id Number : 	COM1234
// Date :				1/9/2005
// Purpose : 			A sample ob ject orientation program - Employee Records
//*****************************************************************************

{
	public static void searchObject(Employee[] empArray)
	{
		int index ;
		int noOfElements = 3;
		String searchName ;
		
		System.out.print("Enter Search Name : " ) ;
		searchName = EasyIn.getString();
		index = 0 ;
		while((index < noOfElements) && !(empArray[index].getName().equals(searchName))) // IF FALSE
		   {
			index ++; //Next Index steps through array
		   }
		if (index < noOfElements) //If True (name found)
		   {
		   		System.out.println("\n\nEMPLOYEE FOUND");
		   		System.out.println(empArray[index].toString());
		   }
		else
		   {
			System.out.println("EMPLOYEE NOT FOUND");	
		   }	
		
	}
	
	public static int findPlace(Employee theArray[], String theName, int noOfValues)	
	{
		int step; 
			int place;
			
		    
		step = 0 ;
		while ((step < noOfValues) && (theName.compareTo(theArray[step].getName()) > 0))
			{
			   step ++;
			}
		place = step ;   // Finds the correct location of place	
		return place;
			
	}
		
	public static int addOne(Employee theArray[], int place, Employee theObject, int noOfValues)	
	{
		 
	 	int step;
		
	 	if (noOfValues == 0)
			{
				theArray [0] = theObject;
				noOfValues ++;	
			}
	 	else
			{					
		  		for (step = noOfValues - 1 ; step >= place; step --)
					{
						theArray[step + 1] = theArray[step] ;
					}						
				theArray[place] = theObject;			
				noOfValues ++	;
			}
	
	 	return noOfValues;
	}
	

	
	public static void main(String[] args)
	{	
		Employee empArray[];  // Array of Employee objects
		Employee tempObject[];
		int place;
		int index;
		int noOfElements;
		String currentName;
		String currentId;
		int currentAge;
		
		String newName ;
		String newId ;
		int newAge ;
		
		empArray = new Employee[3]; //Create array
		noOfElements = 0;
		for(index = 0; index < 3; index++)
			{
				System.out.print("Enter name ");
				currentName = EasyIn.getString();
				System.out.print("Enter Id ");
				currentId = EasyIn.getString();
				System.out.print("Enter age ");
				currentAge = EasyIn.getInt();
				System.out.println();
				tempObject = new Employee(newName,newId,newAge);
				place = findPlace(empArray,newName,noOfElements);
				noOfElements = addOne(empArray,place,tempObject,noOfElements);	

				empArray[index] = new Employee(); //create object
    			empArray[index].setName(currentName);
    			empArray[index].setId(currentId);
    			empArray[index].setAge(currentAge);
    			noOfElements ++;

			}
			
		for(index = 0; index < 3; index++)
			{
				System.out.println(empArray[index].toString());
			}
	
		searchObject(empArray); //Search Employee
	
	
	}
	
	

}



