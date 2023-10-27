import java.util.Scanner;

public class JavaMain {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num=0;
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int arr2[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
		do {
				System.out.println("enter the option 1.display 2. add two array 3. find transpose 4.minimum  number from 2d array 5.maximum number from 2d array 6.check the paraticular number appears how many times in 2d array 7.exit");
				num=sc.nextInt();
				
				switch(num) {
				case 1 :
					DisplayArray.displayArray(arr);
					
				case 2 :
					AdditionOFTwoArray.additionOfTwoArray(arr, arr2);
					break;
					
				case 3 :
					TransposeOfMatrix.transposeOfTwoMatrix(arr2);
					break;
					
				case 4 :
					MinInArray.minInArray(arr2);
					break;
					
				case 5 :
					MaxInArray.maxInArray(arr2);
					break;
					
				case 6 :
					System.out.println("enter the  number to be searched");
					int num1=sc.nextInt();
					 NumberCount.numberCount(arr2, num1);
					break;
						
				case 7 :
					
					System.out.println("thank you");
					break;
					
				default :
					System.out.println("wrong choice");
				}
				
				
		} while (num!=7);	
		
	}
}
