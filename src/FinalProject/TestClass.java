package FinalProject;
import java.io.*;
import java.util.Scanner;


public class TestClass {
	

	public static void main(String [] args) throws IOException {
		final int ONE   = 1;
        final int TWO   = 2;
        final int THREE = 3;
        final int FOUR  = 4;
        final int FIVE  = 5;
		int choice;
		boolean flag = true;
		System.out.println("\n-----------------------------------------------------------" );
		System.out.println("\t Covid-19 Patient Database of Dhaka City" );
		System.out.println("-----------------------------------------------------------\n" );		
		System.out.println("| Clean your hands often | Use mask | Limit social gatherings |\n" );
		
		
		// Main menu
		while(flag) {

				//Try/catch to prevent runtime error
				try {
					Scanner input = new Scanner(System.in);
					System.out.println("1. Patient Form\n2. Managment\n3. Plasma Bank\n4. Exit\n" );
					choice = input.nextInt();
				}
				catch(Exception e){
					
					choice = 0;
				}
				
				 switch(choice) {
				 
				  case ONE:
					  //Patient
					  Patient obj1 = new Patient (); 
					  obj1.main();
				      break;
				        
				  case TWO: 
					  //Management
					  Login L;
					  L = new Management();
					  L.verify();	  
				      break;
				    
				  case THREE:
					  //Show plasma donor list
					  PlasmaBank obj = new PlasmaBank("Donor.txt");
					  break;
					    
				  case FOUR:
					  System.out.println("\nExited\n" );
					  flag = false;
					   break; 
				  default:
					  System.out.println("\nPlease Select between 1 to 5\n" );
					  continue;
				}
				 
				Updates up = new Updates();
				 //Updates count of COVID29 info
				 int tests = up.Counter("DB2.txt");
				 int pos = up.Counter(tests,"DB2.txt");

				 int tests2 = up.Counter("DB.txt");	 
				 int pos2 = up.Counter(tests2,"DB.txt");
				 
				 int testsCount = tests + tests2;
				 int posCount = pos + pos2;
				 
				//Prints Updated count
				 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				 System.out.println("Number of Tests: "+testsCount);
				 System.out.println("Positive Cases: "+posCount);
				 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			
			
			
		}
		
		
	}

}
