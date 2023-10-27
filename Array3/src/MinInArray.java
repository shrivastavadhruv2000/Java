
public class MinInArray {
	
	public static void minInArray(int [][] arr) {
		
		int min=9999999;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr.length; j++) {
				
				if(min> arr[i][j]) {
					min=arr[i][j]; 
				}
			}
		}
		System.out.println("minimum in array is " + min);
	}
	

}
