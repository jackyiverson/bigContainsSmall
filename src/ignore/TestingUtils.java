package ignore;

import java.util.Arrays;

import assignment_16.App;

public class TestingUtils {
	
	public static void runTests(){
		
		int [][] params1 = {{1,2,4,6},{1,2,4,6},{1,2,4,4,6},{2,2,4,4,6,6},{2,2,2,2,2},{2,2,2,2,2},{2,2,2,2,4},{1,2,3},{1,2,3},{1,2,3},{-1,0,3,3,3,10,12},{-1,0,3,3,3,10,12},{-1,0,3,3,3,10,12}};
		int [][] params2 = {{2,4},{2,3,4},{2,4},{2,4},{2,2},{2,4},{2,4},{2},{-1},{},{-1,0,3,12},{0,3,12,14},{-1,10,11}};
		
		boolean  [] expected = {true,false,true,true,true,false,true,true,false,true,true,false,false};
        
		for(int i=0; i < params1.length; i++){
			boolean result = App.bigContainsSmall(params1[i], params2[i]);
			if(result == expected[i]) {
				System.out.println(printPassResult(params1[i], params2[i], expected[i], result));
			} else{
				System.out.println(printFailResult(params1[i], params2[i], expected[i], result));
			}
		}
	}
	
	private static String printPassResult(int[] params1, int[] params2, Object expected, Object result){
		return "PASS: bigContainsSmall("+ Arrays.toString(params1)+ ", "+ Arrays.toString(params2)+ ") -> " + result.toString();
	}
	
	
	private static String printFailResult(int[] params1, int[] params2, Object expected, Object result){
		String ret = "**********************" + "\n";
		ret += "FAIL: bigContainsSmall("+ Arrays.toString(params1)+ ", "+ Arrays.toString(params2)+ ") -> " + result.toString() 
		+ "      Expected: "+ expected.toString();
		ret += "\n" + "**********************";
		return ret;
	}

}
