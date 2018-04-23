package matrixBinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchMatrix {
	
	public static void main(String[] args) {
		
		int[][] m = {
				  {1,   4,  7, 11, 15},
				  {2,   5,  8, 12, 19},
				  {3,   6,  9, 16, 22},
				  {10, 13, 14, 17, 24},
				  {18, 21, 23, 26, 30}
				};
		System.out.println(searchMatrix(m,17));
	}
	
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length==0){return false;}
        int rows = matrix.length;
        
        int l = 0;
        int r = matrix[0].length -1;
        
        while(r>=0 && l<rows){
        	int val = matrix[l][r];
            if(matrix[l][r]==target){return true;}
            else if(matrix[l][r]<target){
                l++;
            }else{
                r--;
            }
        }
        return false;
        
    }
}
