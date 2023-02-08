package test;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] table = {1, 0, 1, 0, 0, 1, 1,3,5,6,7,8,1,23,5,10,20,30};
		
		//bucketSort(table);
		selectionSort(table);
		System.out.println(Arrays.toString(table));
	}
	
	static void selectionSort( int[] tabel ) {
	for ( int i=0; i<tabel.length-1; i++ ) { //selection sort
	    int minIndex = i;

	    for ( int candidatIndex=i+1; candidatIndex<tabel.length; candidatIndex++ )
	      if ( tabel[candidatIndex] % 2 == 0 )
	        minIndex = candidatIndex;

	    swap( tabel, i, minIndex );
	}
	}
	
	static void swap( int[] tabel, int x, int y ) {
		  int temp = tabel[y];
		  tabel[y] = tabel[x];
		  tabel[x] = temp;
		}

}
