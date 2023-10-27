
public class TransposeOfMatrix {
	public static void transposeOfTwoMatrix(int [][] arr) {
		int temp[][]= new int[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr.length; j++) {
				temp[j][i]= arr[i][j] ;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr.length; j++) {
				System.out.print(temp[i][j] +  " "); ;
			}
			System.out.println(" ");
		}
		
		
	}
	

}
