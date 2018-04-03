package matrixRangeAddition2;
public class MatrixRangeAddition2 {
	
	public static void main(String args[]){
		int[][] num={{}};
				
		
		System.out.println(maxCount(4000,4000,num ));
	}
    public static int maxCount(int row, int col, int[][] ops) {
        
    	        // if(row<0 || row>ops.length || col<0 || col>ops[0].length){
    	        //     return 0;
    	        // }
    	        

    	        
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
    
//    public int maxCount(int m, int n, int[][] ops) {
//        for (int[] op: ops) {
//            m = Math.min(m, op[0]);
//            n = Math.min(n, op[1]);
//        }
//        return m * n;
//    }
}

