
public class AdditionOFTwoArray {
		public static void additionOfTwoArray(int [][] arr, int [][] arr2) {
			int temp[][]= new int[3][3];
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0;j<arr.length; j++) {
					temp[i][j]= arr[i][j] + arr2[i][j];
				}
			}
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0;j<arr.length; j++) {
					System.out.print(temp[i][j]+"  ");
				}
				System.out.println(" ");
			}
		}
}
