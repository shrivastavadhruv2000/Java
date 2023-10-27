
public class NumberCount {
	public  static void numberCount(int [][]arr, int n ) {
		
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr.length; j++) {
				if(n== arr[i][j]) {
					count++;
				}
			}
		}
		
		System.out.println("count of " + n + "is " + count);
	}

}
