import java.util.Scanner;

public class DiamondPatterrn2 {
	public static String displayPattern(int num) {
		
		
		int sc=(int)(num/2);
		for(int i=1;i<=num;i=i+2) {
			String s= "";
			for (int k=1;k<=sc;k++)
			{
				s=s+"-";
				
			}
			String star="";
			for (int j=1;j<=i;j++) {
				star= star+"*";
			}
			System.out.println(s+star);
			sc=sc-1;
			System.out.println();
		
		}
		sc=1;
		for(int i=num-2;i>=1;i=i-2) {
			String s="";
			for(int k=0;k<sc;k++) {
				s=s+"-";
			}
			String star="";
			for(int j=i;j>=1;j--) {
				star= star+"*";
			}
			System.out.println(s+star);
			sc=sc+1;
			System.out.println();
		}
	
		

		
		return null;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of rows");
		int num = sc.nextInt();
		displayPattern(num);
	}

}
