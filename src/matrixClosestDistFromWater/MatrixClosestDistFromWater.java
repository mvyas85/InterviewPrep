package matrixClosestDistFromWater;

import java.util.ArrayList;
import java.util.Collections;

public class MatrixClosestDistFromWater {

	public static void main(String args[]) {
		int m[][] ={{0,0,1,0,1,2,1,0,1,2},
				    {1,1,2,1,0,1,1,1,2,2},
				    {2,1,3,1,1,0,0,0,1,2},
				    {1,0,1,0,1,1,1,0,1,2},
				    {0,0,1,1,1,0,1,1,2,4},
				    {1,0,1,2,1,1,1,2,1,4},
				    {1,1,1,1,0,1,0,1,0,1},
				    {0,1,0,0,0,1,0,0,1,2},
				    {1,1,1,0,1,1,0,1,0,1},
				    {1,0,1,1,1,0,1,2,1,0}};
		
		updateMatrix(m);
		
		
		System.out.println("Prniting  matrix:");
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

	public static int[][] updateMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					matrix[i][j] = searchWater(matrix, i, j);
				}
			}
		}
		return matrix;
	}

	public static int searchWater(int[][] matrix, int i, int j) {

        int rightIndex = 1 ,leftIndex = 1,topIndex = 1,bottomIndex = 1;
        ArrayList<Integer> values = new ArrayList<Integer>();
        //check down
        int curIndex = i;
        if(curIndex+1 == matrix.length){
        	bottomIndex = -1;
        }
        while( curIndex+1<matrix.length){
            if(matrix[++curIndex][j] != 0){
                bottomIndex++;
            }else{
            	break;
            }
        }
        if(bottomIndex != -1){values.add(bottomIndex);}
        //Check top
        curIndex = i;
        if(curIndex-1== -1){
        	topIndex = -1;
        }
        while(curIndex-1>=0){
            if(matrix[--curIndex][j] != 0){
                topIndex++;
            }else{
            	break;
            }
        }
        if(topIndex != -1){values.add(topIndex);}
        //Check right
        curIndex = j;
        if(curIndex+1==matrix[i].length){
        	rightIndex = -1;
        }
        while(curIndex+1<matrix[i].length){
            if(matrix[i][++curIndex] != 0){
                rightIndex++;
            }else{
            	break;
            }
        }
        if(rightIndex != -1){values.add(rightIndex);}
        //check left
        curIndex = j;
        if(curIndex-1 == -1){
        	leftIndex = -1;
        }
        while(curIndex-1>=0){
            if(matrix[i][--curIndex] != 0){
                leftIndex++;
            }else{
            	break;
            }
        }
        if(leftIndex != -1){values.add(leftIndex);}
        int min;
        if(values.size() >0){
            min = Collections.min(values);
        }else{
            min = matrix[i][j];
        }
        
        return min;

	}
}