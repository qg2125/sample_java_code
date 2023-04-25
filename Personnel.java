import java.util.*;
public class Personnel {
	Scanner scan = new Scanner(System.in);
	private ArrayList<Person> personList = new ArrayList<Person>();


	public void addPersonnel()
	{	//read the personnel's attributes
		//add to the personList
		System.out.println("Personnel Type (0 - Person, 1 - Employee, 2 - Executives, 3 - Security, 4 - Volunteers)?: ");
		int type = scan.nextInt();

		System.out.println("Enter first name: ");
		scan.nextLine();
		String firstN = scan.nextLine();
		System.out.println("Enter last name: ");
		String lastN = scan.nextLine();
		System.out.println("Enter middle name: ");
		String middleN = scan.nextLine();

		if(type == 0){
			Person newPersonnel = PersonnelFactory.createPersonnel(type, new Object[]{(Object)lastN,(Object)firstN,(Object)middleN});
			personList.add(newPersonnel);
		}

		if(type==1) {
			System.out.println("Enter employ id : ");
			int empID = scan.nextInt();
			System.out.println("Enter base salary" );
			double salary = scan.nextDouble();
			scan.nextLine();
			Person newPersonnel = PersonnelFactory.createPersonnel(type, new Object[]{(Object)lastN,(Object)firstN,(Object)middleN,(Object) empID,(Object) salary});
			personList.add(newPersonnel);
		}


	}

	public void foundPersonnel(){
		System.out.println("Enter first name : ");
		String firstN = scan.nextLine();

		System.out.println("Enter last name : ");
		String lastN = scan.nextLine();

		boolean found = false;
		int loc =-1;
		for(int i =0; i <personList.size(); i++)
		{
			if( personList.get(i).getFirst().equals(firstN) && personList.get(i).getLast().equals(lastN))
			{
				found = true;
				loc = i;
			}
		}

		if(found)
		{
			System.out.println("Found");
			System.out.println(personList.get(loc).getFirst() + "  " + personList.get(loc).getMiddle() + "  " + personList.get(loc).getLast());

		}else
		{
			System.out.println("Not found! Please add the personnel!");
			addPersonnel();
		}
	}

	public void printNames(){
		System.out.println("Enter the order 0: first, middle,  last, 1: first, last, middle, 2: last, first , middle ");
		int order = scan.nextInt();


		for(int i=0; i<personList.size(); i++)
		{
			if(order == 0)
			{
				System.out.println(personList.get(i).getFirst() + "  " + personList.get(i).getMiddle() + "  " + personList.get(i).getLast());

			}else if(order == 1)
			{

				System.out.println(personList.get(i).getFirst() + ", " + personList.get(i).getLast() + " " + personList.get(i).getMiddle());

			}
			else if(order == 2)
			{

				System.out.println(personList.get(i).getLast() + ", " + personList.get(i).getFirst()+ " " + personList.get(i).getMiddle());

			}
		}
	}

	public void countEntry(){
		System.out.println("Total Entries : " + personList.size());
	}


}