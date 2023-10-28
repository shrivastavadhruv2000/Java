import java.util.Scanner;

public class StudentService {
	static Student [] sarr;
	static int cnt;
	static {
		sarr= new Student[100];
		sarr[0]= new Student(1,"abc","xyz");
		sarr[1]= new Student(2,"abc","xyz");
		sarr[2]= new Student(3,"abc","xyz");
		sarr[3]= new Student(4,"abc","xyz");
		
		cnt=4;
	}
	
	public static void addNewStudent() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter student id");
		int id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("enter student name");
		String name=sc.nextLine();
		System.out.println("enter the last name");
		String lname=sc.nextLine();
		sarr[cnt]=new Student(id,name,lname);
		cnt++;
		
		
		
	}
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(sarr[i]);
		}
	}
	public static Student displayById(int num) {
		for(Student s:sarr) {
			if(s!=null) {
				if(s.getSid()==num) {
					return s;
				}
			
			}else {
				return null;
			}
		}return null;
		
	}
	

}
