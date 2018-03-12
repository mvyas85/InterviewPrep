package matrixRow0;

/*
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
	row0Matrix(m);
	
	System.out.println("Prniting  matrix:");
	for(int i=0;i<m.length;i++){
		for(int j=0;j<m[0].length;j++){
			System.out.print(m[i][j]+" ");
		}
		System.out.println();
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
