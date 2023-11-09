import java.time.LocalDate;
import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. add new Employee\n 2. Modify salary \n3. display all\n ");
			System.out.println("4. display by id \n 5. calculate salary by id\n 6. calculate Bonus\n 7. exit\nchoice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1. Salaried \n 2. Contract \n 3. vendor");
				int ch=sc.nextInt();
				EmployeeServices.addNewEmployee(ch);
				break;
			case 2:
				System.out.println("enetr id");
				int pid=sc.nextInt();
				System.out.println("enter salary");
				double s=sc.nextDouble();
				boolean status=EmployeeServices.ModifySalById(pid,s);
				if(status) {
					System.out.println("yewjh");
				}
				else {
					System.out.println("jhjh");
				}
			case 3:
				EmployeeServices.displayAll();
				break;
			case 4:
				break;
			case 5:
				System.out.println("enter id");
				pid=sc.nextInt();
				double salary=EmployeeServices.calculateSalaryById(pid);
				if(salary!=1) {
					System.out.println("Net Salary : "+salary);
				}
				else {
					System.out.println("not found");
				}
				break;
			case 6:
				break;
			case 7:
				sc.close();
				System.out.println("Thanks");
				break;
			default:
				System.out.println("wrong choice");
				break;	
			}
		}while(choice!=7);
	
		
	}

}
