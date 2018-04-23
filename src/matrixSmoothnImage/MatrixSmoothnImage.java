package matrixSmoothnImage;
/**
 * 
 * 
 * 661. Image Smoother
 * 
 * Given a 2D integer matrix M representing the gray scale of an image, you need to design a 
 * smoother to make the gray scale of each cell becomes the average gray scale (rounding down)
 * of all the 8 surrounding cells and itself. If a cell has less than 8 surrounding cells,
 * then use as many as you can.

Example 1:
Input:
[[1,1,1],
 [1,0,1],
 [1,1,1]]
Output:
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]
Explanation:
For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
For the point (1,1): floor(8/9) = floor(0.88888889) = 0
Note:
The value in the given matrix is in the range of [0, 255].
The length and width of the given matrix are in the range of [1, 150].



 *
 */
public class MatrixSmoothnImage {

	public static void main(String args[]) {
		int m[][] = { { 0, 0, 1, 0, 1, 2, 1, 0, 1, 2 }, { 1, 1, 2, 1, 0, 1, 1, 1, 2, 2 },
				{ 2, 1, 3, 1, 1, 0, 0, 0, 1, 2 }, { 1, 0, 1, 0, 1, 1, 1, 0, 1, 2 }, { 0, 0, 1, 1, 1, 0, 1, 1, 2, 4 },
				{ 1, 0, 1, 2, 1, 1, 1, 2, 1, 4 }, { 1, 1, 1, 1, 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 0, 0, 1, 0, 0, 1, 2 },
				{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1, 2, 1, 0 } };
	}
	

    public static int[][] imageSmoother(int[][] M) {
    	
    	int rowLen = M.length;
    	int colLen = M[0].length;
    	
    	int ans[][]= new int[rowLen][colLen] ;
    	
    	int sum = 0;
    	int count= 0;
    	for(int row=0;row<rowLen;row++){
    		for(int col=0;col<rowLen;col++){
    			sum = M[row][col];
    			count = 1;
    			
    			int top = row-1;
    			int bottom = row+1;
    			int left = col-1;
    			int right = col+1;
    			
    			if(top>=0){
    				sum += M[top][col];
    				count++;

        			if(left>=0){
        				sum += M[top][left];
        				count++;
        			}    			
        			if(right<colLen){
        				sum += M[top][right];
        				count++;
        			}
    			}
    			
    			if(bottom<rowLen){
    				sum += M[bottom][col];
    				count++;
        			if(left>=0){
        				sum += M[bottom][left];
        				count++;
        			}    			
        			if(right<colLen){
        				sum += M[bottom][right];
        				count++;
        			}
    			}
    			
    			if(right<colLen){
    				sum += M[row][right];
    				count++;
    			}
    			
    			if(left>=0){
    				sum += M[row][left];
    				count++;
    			}
    			
    			ans [row][col] = (int) Math.floor(sum/count);
    			
    		}
    	}
    	return ans;
    }
}
