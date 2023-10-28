import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. Add new student\n 2. dispaly all\n 3. display by id" );
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				StudentService.addNewStudent();
				break; 
			case 2:
				StudentService.displayAll();
				break;
			case 3:
				int num= sc.nextInt();
				StudentService.displayById(num);
			}
		}while(choice!=6);
	}
	
	

}
