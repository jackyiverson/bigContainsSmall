package ignore;

import java.util.Arrays;

import assignment_16.App;

public class TestingUtils {
	
	public static void runTests(){
		
		int [][] params1 = {{1,2,4,6},{2,2,2,2,2},{1,2,4,6},{1,2,4,6},{1,2,4,4,6},{1,2,3,4,5,6},{2,3,4,5,6,7},{2,3,4,5,6,7,8},{2,3,4,4,4,5,5,6,7,8},{2,3,4,4,4,5,5,5,5,6,7,8}};
		int [][] params2 = {{2},{2,2,2,2},{2,4},{2,3,4},{2,4},{1,3,5},{1,2,3,4,7},{2,2,3,4,4},{4,4,4,4,4,5,5,8},{4,4,4,5,5,6,7,8}};
		
		boolean  [] expected = {true,true,true,false,true,true,false,false,false,true};
        
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
