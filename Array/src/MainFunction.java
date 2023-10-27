import java.util.Scanner;

public class MainFunction {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		TestArray.acceptData(arr);
		TestArray.displayData(arr);
		
		int sum = TestArray.findSum(arr);
		System.out.println("sum = " + sum);
		
		int val=5;
		int cnt = TestArray.allGreaterValues(arr, val);
		System.out.println("Count of greater than val = "+ cnt);
		
		
		TestArray.searchValue(arr,val);
	}

}
