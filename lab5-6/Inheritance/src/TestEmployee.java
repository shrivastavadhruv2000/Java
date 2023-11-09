import java.time.LocalDate;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
	
        SalariedEmployee semp=new SalariedEmployee(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345);
		System.out.println(semp);
		semp.calculateSal();
	
		ContractEmployee cemp=new ContractEmployee(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),30,4000);
		cemp.calculateSal();
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		Employee e1=null;
		
		if(i>5)
		    e1=new SalariedEmployee();
		else 
			e1=new ContractEmployee();
		e1.calculateSal();
		Person p=new SalariedEmployee();
		System.out.println(cemp);
		SalariedEmployee s=(SalariedEmployee)e1;
	}

}
