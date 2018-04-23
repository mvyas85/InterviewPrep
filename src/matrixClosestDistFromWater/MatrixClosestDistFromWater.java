package matrixClosestDistFromWater;

import java.util.ArrayList;
import java.util.Collections;

public class MatrixClosestDistFromWater {

//	public static void main(String args[]) {
//		int m1[][] = { { 0, 0, 1, 0, 1, 2, 1, 0, 1, 2 }, { 1, 1, 2, 1, 0, 1, 1, 1, 2, 2 },
//				{ 2, 1, 3, 1, 1, 0, 0, 0, 1, 2 }, { 1, 0, 1, 0, 1, 1, 1, 0, 1, 2 }, { 0, 0, 1, 1, 1, 0, 1, 1, 2, 4 },
//				{ 1, 0, 1, 2, 1, 1, 1, 2, 1, 4 }, { 1, 1, 1, 1, 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 0, 0, 1, 0, 0, 1, 2 },
//				{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1, 2, 1, 0 } };
//		int m[][] = {{0, 0, 1, 0, 1, 1, 1, 0, 1, 1}, {1, 1, 1, 1, 0, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 0, 0, 0, 1, 1}, {1, 0, 1, 0, 1, 1, 1, 0, 1, 1}, {0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 0, 1, 0, 1, 0, 1}, {0, 1, 0, 0, 0, 1, 0, 0, 1, 1}, {1, 1, 1, 0, 1, 1, 0, 1, 0, 1}, {1, 0, 1, 1, 1, 0, 1, 1, 1, 0}};
//
//		
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[0].length; j++) {
//				System.out.print(m[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		updateMatrix(m);
//
//		System.out.println("\n\n\n\nPrniting  matrix:");
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[0].length; j++) {
//				System.out.print(m[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//	}

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

	public static int searchWater(int[][] matrix, int row, int col) {

		ArrayList<Integer> values = new ArrayList<Integer>();

		for(int i=1;i<matrix.length;i++){
			for(int j = i*-1;j<=i;j++)
			if(row + i < matrix.length && row - i >= 0){
				break;
			}
		}
		
		
		
		
		
/*		
//		int count = 1;
//		boolean isItWater = false;
//		//////// check down ////////
//		for (int i = 1; row + i < matrix.length; i++) {
//			if (matrix[row + i][col] != 0) {
//				count++;
//			} else {
//				isItWater = true;
//				break;
//			}
//		}
//		if (isItWater) {
//			values.add(count);
//		}
//
//		count = 1;
//		isItWater = false;
//		//////// Check top ////////
//
//		for (int i = 1; row - i >= 0; i++) {
//			if (matrix[row - i][col] != 0) {
//				count++;
//			} else {
//				isItWater = true;
//				break;
//			}
//		}
//		if (isItWater) {
//			values.add(count);
//		}
//
//		count = 1;
//		isItWater = false;
//		//////// Check right ////////
//		for (int i = 1; col + i < matrix[row].length; i++) {
//			if (matrix[row][col + i] != 0) {
//				count++;
//			} else {
//				isItWater = true;
//				break;
//			}
//		}
//
//		if (isItWater) {
//			values.add(count);
//		}
//		count = 1;
//		isItWater = false;
//		//////// check left ////////
//		for (int i = 1; col - i >= 0; i++) {
//			int d = matrix[row][col - 1];
//			if (matrix[row][col - i] != 0) {
//				count++;
//			} else {
//				isItWater = true;
//				break;
//			}
//		}
//		if (isItWater) {
//			values.add(count);
//		}
//
//		count = 2;
//		isItWater = false;
//		//////// check top - left ////////
//
//		for (int i = 1; row - i >= 0 && col - i >= 0; i++) {
//			if (matrix[row - i][col - i] != 0) {
//				count += 2;
//			} else {
//				isItWater = true;
//				break;
//			}
//		}
//
//		if (isItWater) {
//			values.add(count);
//		}
//
//		count = 2;
//		isItWater = false;
//		//////// check bottom - left ////////
//		for (int i = 1; row + i < matrix.length && col - i >= 0; i++) {
//			if (matrix[row + i][col - i] != 0) {
//				count += 2;
//			} else {
//				isItWater = true;
//				break;
//			}
//		}
//		if (isItWater) {
//			values.add(count);
//		}
//
//		count = 2;
//		isItWater = false;
//		/////// check bottom right ///////
//		for (int i = 1; row + i < matrix.length && col + i < matrix[row].length; i++) {
//			if (matrix[row + i][col + i] != 0) {
//				count += 2;
//			} else {
//				isItWater = true;
//				break;
//			}
//		}
//		if (isItWater) {
//			values.add(count);
//		}
//
//		count = 2;
//		isItWater = false;
//		/////// check top right ///////
//		for (int i = 1; col + i < matrix.length && row - i >= 0; i++) {
//			if (matrix[row - i][col + i] != 0) {
//				count += 2;
//			} else {
//				isItWater = true;
//				break;
//			}
//		}
//		if (isItWater) {
//			values.add(count);
*/
		int min;
		if (values.size() > 0) {
			min = Collections.min(values);
		} else {
			min = matrix[row][col];
		}

		return min;

	}
}

/*
 * class Solution { public int[][] updateMatrix(int[][] matrix) {
 * 
 * for(int i =0;i<matrix.length;i++){ for(int j =0;j<matrix[i].length;j++){
 * if(matrix[i][j]==1){ matrix[i][j] = searchWater(matrix,i,j); } } } return
 * matrix; }
 * 
 * public int searchWater(int[][]matrix,int i,int j){ int rightIndex = 1
 * ,leftIndex = 1,topIndex = 1,bottomIndex = 1; ArrayList<Integer> values = new
 * ArrayList<Integer>(); //check down int curIndex = i; if(curIndex+1 ==
 * matrix.length){ bottomIndex = -1; } while( curIndex+1<matrix.length){
 * if(matrix[++curIndex][j] != 0){ bottomIndex++; }else{ break; } }
 * if(bottomIndex != -1){values.add(bottomIndex);} //Check top curIndex = i;
 * if(curIndex-1== -1){ topIndex = -1; } while(curIndex-1>=0){
 * if(matrix[--curIndex][j] != 0){ topIndex++; }else{ break; } } if(topIndex !=
 * -1){values.add(topIndex);} //Check right curIndex = j;
 * if(curIndex+1==matrix[i].length){ rightIndex = -1; }
 * while(curIndex+1<matrix[i].length){ if(matrix[i][++curIndex] != 0){
 * rightIndex++; }else{ break; } } if(rightIndex != -1){values.add(rightIndex);}
 * //check left curIndex = j; if(curIndex-1 == -1){ leftIndex = -1; }
 * while(curIndex-1>=0){ if(matrix[i][--curIndex] != 0){ leftIndex++; }else{
 * break; } } if(leftIndex != -1){values.add(leftIndex);} int min;
 * if(values.size() >0){ min = Collections.min(values); }else{ min =
 * matrix[i][j]; }
 * 
 * return min; }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * /* public List<List<Integer>> updateMatrix(List<List<Integer>> matrix) { if
 * (matrix.size() == 0 || matrix.get(0).size() == 0) return matrix; int M =
 * matrix.size(), N = matrix.get(0).size(); for (int i = 0; i < M; i++) for (int
 * j = 0; j < N; j++) { if (matrix.get(i).get(j) == 0) continue; int val =
 * Integer.MAX_VALUE - 1; if (i > 0) val = Math.min(val, matrix.get(i -
 * 1).get(j) + 1); if (j > 0) val = Math.min(val, matrix.get(i).get(j - 1) + 1);
 * matrix.get(i).set(j, val); }
 * 
 * for (int i = M - 1; i >= 0; i--) for (int j = N - 1; j >= 0; j--) { if
 * (matrix.get(i).get(j) == 0) continue; int val = matrix.get(i).get(j); if (i <
 * M - 1) val = Math.min(val, matrix.get(i + 1).get(j) + 1); if (j < N - 1) val
 * = Math.min(val, matrix.get(i).get(j + 1) + 1); matrix.get(i).set(j, val); }
 * return matrix; }
 */