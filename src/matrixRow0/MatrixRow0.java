package matrixRow0;

/**
 * 73. Set Matrix Zeroes
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

click to show follow up.

Follow up:
Did you use extra space?
A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?


 * Given a NxN matrix with 0s and 1s. Set every row that contains a 0 to all 0s
 * and set every column that contains a 0 to all 0s.

For example

1 0 1 1 0
0 1 1 1 0
1 1 1 1 1
1 0 1 1 1
1 1 1 1 1
results in

0 0 0 0 0
0 0 0 0 0
0 0 1 1 0
0 0 0 0 0
0 0 1 1 0
 */
public class MatrixRow0 {

	public static void main(String[] args) {
		int m[][] = {
                { 1, 0, 1, 1, 0 },
                { 0, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 1 },
                { 1, 0, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 }
            };
		setZeroes(m);
	
	System.out.println("Prniting  matrix:");
	for(int i=0;i<m.length;i++){
		for(int j=0;j<m[0].length;j++){
			System.out.print(m[i][j]+" ");
		}
		System.out.println();
	}

	}
	
	//online solutio o(1) space
	  public static void setZeroes(int[][] matrix) {
	        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
	            return;
	        }
	        int col0 = 1, rows = matrix.length, cols = matrix[0].length;
	        for (int i = 0; i < rows; ++i) {
	            if (matrix[i][0] == 0) {
	                col0 = 0;
	            }
	            for (int j = 1; j < cols; ++j) {
	                if (matrix[i][j] == 0) {
	                    matrix[i][0] = 0;
	                    matrix[0][j] = 0;
	                }
	            }
	        }
	        for (int i = rows - 1; i >= 0; --i) {
	            for (int j = cols - 1; j >= 1; --j) {
	                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
	                    matrix[i][j] = 0;
	                }
	            }
	            if (col0 == 0) {
	                matrix[i][0] = 0;
	            }
	        }
	    }
	  
	public static void row0Matrix1(int[][] m){
		if(m.length == 1){ return;}
		int[] colM = new int[m.length];
		int[] rowM = new int[m[0].length];
		
		for(int i=0;i<rowM.length;i++){
			rowM[i] = 1;
		}
		for(int i=0;i<colM.length;i++){
			colM[i] = 1;
		}
		for(int i=0;i<m.length;i++){
			for(int j = 0;j<m[i].length;j++){
				if(m[i][j]==0){
					rowM[j] = 0;
					colM[i] = 0;
				}
			}
		}

		for(int i=0;i<colM.length;i++){
			for(int j = 0;j<rowM.length;j++){
				m[i][j] = colM[i]*rowM[j];
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void row0Matrix(int[][] m){
		int noRows = m.length;
		int noCols = m[0].length;
		int[] row = new int[noRows] ;
		int[] col = new int[noCols] ;
		
		for(int i=0;i<noRows;i++){
			int bitwiseAndRow =1;
			int bitwiseAndCol =1;
			int j;
			for(j=0;j<noCols;j++){
				bitwiseAndRow = bitwiseAndRow & m[i][j] ;
				bitwiseAndCol = bitwiseAndCol & m[i][j] ;
			}
			row[i] = bitwiseAndRow;
			j--;
			col[j] = bitwiseAndCol;
		}
		
		for(int i=0;i<noRows;i++){
			for(int j=0;j<noCols;j++){
				m[i][j] = row[i] & col[j];
			}
		}
	}

}
