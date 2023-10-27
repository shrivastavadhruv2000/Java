import java.util.Scanner;

public class TestArray {
	public static void acceptData(int[] arr) {
		System.out.println("Enter the values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
	}
	public static void displayData(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int findSum(int[] arr) {
		int sum=0;
		/*for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}*/
		for(int var:arr) {
			sum=sum+var;
		}
		return sum;
	}
	public static int allGreaterValues(int[] arr, int val) {
		// TODO Auto-generated method stub
		
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>val) {
				cnt += 1;
			}
		}
		return cnt;
	}
	 public static int searchValue(int[] arr,int val) {
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==val) {
				 System.out.println("Value found");
			 }
			 else {
				 System.out.println("Value not found");
				 break;
			 }
		 }
		 return 0;
	 }

}
