
public class MaxInArray {
	public static void maxInArray(int [][] arr) {
		
		int max=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr.length; j++) {
				if(max < arr[i][j]) {
					max=arr[i][j]; 
				}
			}
		}
		System.out.println("maximum in array is " + max);
	}
	
}
