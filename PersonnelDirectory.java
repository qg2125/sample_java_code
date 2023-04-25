import java.util.Scanner;
public class PersonnelDirectory
{
	private static Personnel newPersonnel = new Personnel();

   public static void main(String[] args)
   {
	   Scanner scan = new Scanner(System.in);


	   do{
		   displayMenu();
		   int choice = scan.nextInt();


          switch(choice)
          {
			  case 1:
				  newPersonnel.addPersonnel();

			  break;

			  case 2:
				  newPersonnel.foundPersonnel();
              break;

			  case 3:
				  newPersonnel.printNames();
               break;

			  case 4:
				  newPersonnel.countEntry();

               break;

		  }

		 } while(true);


  }
	static void displayMenu()
	{
		System.out.println("Welcome to the Personnel Directory Management System");
		System.out.println("====================================================");

		System.out.println("\n\n\t 1. Add Personel");
		System.out.println("\n\t 2. Find Personel");
		System.out.println("\n\t 3. Print Names");
		System.out.println("\n\t 4. Number of Entries in the Directory");

		System.out.println("\n\t Select one of the options above (1, 2, 3, 4)");

	}

}