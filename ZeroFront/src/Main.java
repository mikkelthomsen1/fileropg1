import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] tabel = {1,0,0,1};
		zeroFront(tabel);
		System.out.println(Arrays.toString(tabel));

	}
	public static int[] zeroFront(int[] nums) {
		
		
		for ( int i=0; i<nums.length-1; i++ ) { //selection sort
		    int minIndex = i;

		    for ( int candidatIndex=i+1; candidatIndex<nums.length; candidatIndex++ )
		      if ( nums[candidatIndex] < nums[minIndex] )
		        minIndex = candidatIndex;

		    swap( nums, i, minIndex );
		}
		    return nums;
		  
	}
	
	static void swap( int[] tabel, int x, int y ) {
		  int temp = tabel[y];
		  tabel[y] = tabel[x];
		  tabel[x] = temp;
		}
}
