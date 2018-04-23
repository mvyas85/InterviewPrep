package matrixRangeAddition2;
/**
 * 
 * 
 598. Range Addition II

Given an m * n matrix M initialized with all 0's and several update operations.

Operations are represented by a 2D array, and each operation is represented by an 
array with two positive integers a and b, which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.

You need to count and return the number of maximum integers in the matrix after performing all the operations.

Example 1:
Input: 
m = 3, n = 3
operations = [[2,2],[3,3]]
Output: 4
Explanation: 
Initially, M = 
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]

After performing [2,2], M = 
[[1, 1, 0],
 [1, 1, 0],
 [0, 0, 0]]

After performing [3,3], M = 
[[2, 2, 1],
 [2, 2, 1],
 [1, 1, 1]]

So the maximum integer in M is 2, and there are four of it in M. So return 4.
Note:
The range of m and n is [1,40000].
The range of a is [1,m], and the range of b is [1,n].
The range of operations size won't exceed 10,000.

 * @author vyasma1
 *
 */
public class MatrixRangeAddition2 {
	
	public static void main(String args[]){
		int[][] num={{2,2},{3,3}};
				
		
		System.out.println(maxCount(4000,4000,num ));
	}
	
	
	
  public static int maxCount(int m, int n, int[][] ops) {
  for (int[] op: ops) {
      m = Math.min(m, op[0]);
      n = Math.min(n, op[1]);
  }
  return m * n;
}
	
	
	
    public static int maxCount1(int row, int col, int[][] ops) {
        
    	        // if(row<0 || row>ops.length || col<0 || col>ops[0].length){
    	        //     return 0;
    	        // }
		if (ops.length == 0) {
			return 0;
		}

    	        
    	        int[][] metrix = new int[row][col];

    	        int maxVal = 0;
    	        
    	        for(int k = 0;k<ops.length;k++){
    	                int tRow = ops[k][0];
    	                int tCol = ops[k][1];
    	                
    	                        for(int i = 0;i<tRow;i++){
    	                            for(int j = 0;j<tCol;j++){
    	                                
    	                                metrix[i][j] = ++metrix[i][j];
    	                                if(metrix[i][j]>maxVal){
    	                                    maxVal = metrix[i][j];
    	                                }
    	                            }
    	                        }

    	        
    	        }
    	        
    	        int count =0;
    	        
    	        for(int i = 0;i<row;i++){
    	            for(int j = 0;j<col;j++){
    	                if(metrix[i][j] == maxVal){
    	                    count++;
    	                }
    	            }
    	        }

    	        return count;
    	    }
    

}

