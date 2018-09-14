package assignment_16;

import java.util.Arrays;

import ignore.TestingUtils;

public class App {
	
	
	/**
	 * 
	 
	 Given two arrays of ints sorted in ascending order, called big and small,
	 return true if all of the numbers in small array appear in the big one.
	 
	 <br>
	 <br>
	 
	 * <b>EXPECTATIONS:</b><br>
	 *  bigContainsSmall({1 , 2, 4, 6}, {2, 4})   <b>---></b>true<br>
	 *  bigContainsSmall({1 , 2, 4, 6}, {2, 3, 4})   <b>---></b>false<br>
	 *  bigContainsSmall({1 , 2, 4, 4, 6}, {2, 4})   <b>---></b>true<br>
	 */
	
	public static boolean bigContainsSmall(int[] big, int[] small) {
		int count=0;
		int start=0;
		for (int i=0;i<small.length;i++) {
			for(int j=start;j<big.length;j++) {
				if(small[i]==big[j]) {
					count++;
					start=j+1;
					break;
				}
				
			}
		}
		if (count==small.length) return true;
		else return false;
	}
	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String[] args) {
		TestingUtils.runTests();

	}

}
