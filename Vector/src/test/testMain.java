package test;

import java.util.Scanner;

import com.demo.service.*;
import com.demo.beans.*;

public class testMain {
	public static void main(String []args) {
		
		int choice=0;
		EService e= new EServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("select the choice");
		do {
			System.out.println("1.Add new\n 2.Delete emp by id\n 3.Modify \n");
			System.out.println("4.Display all 5.Display by id 6.Sort by Salary 7.Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1.salaried\n 2.contract\n 3.vendor\n");
				int ch=sc.nextInt();
				e.addnewEmployee(ch);
				break;
			case 2:
				
			case 3:
				
			case 4:
			
			case 5:
			
			case 6:
				
			case 7:
			
			}
		
		
		}
		while(choice!=8);
	}
}
