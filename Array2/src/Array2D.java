import java.util.Scanner;

public class Array2D {
	public static void acceptData2D(int[][] arr) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println("enter the value "+i+"---"+j);
				arr[i][j]=sc.nextInt();
				
			}
		}
	}
	public static void displayData2D(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
	}
	
	

}
