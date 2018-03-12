package rotateMatrics;
/*
 * 
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 * 
 */
public class Rotate90 {

	public static void main(String[] args) {
		int[][] image = {{11,12,13,14,15},
				         {21,22,23,24,25},
				         {31,32,33,34,35},
				         {41,42,43,44,45},
				         {51,52,53,54,55}};


		printImg(image);

		swapRows(image);
		System.out.println();
		

		printImg(image);
	}
	
	 private static void transpose(int[][] m) {

	        for (int i = 0; i < m.length; i++) {
	            for (int j = i; j < m[0].length; j++) {
	                int x = m[i][j];
	                m[i][j] = m[j][i];
	                m[j][i] = x;
	            }
	        }
	}
	 
	public static void swapRows(int[][] m) {
	    for (int  i = 0, k = m.length - 1; i < k; i++, k--) {
	        int[] x = m[i];
	        m[i] = m[k];
	        m[k] = x;
	    }
	}

	public static void rotateByNinetyToLeft(int[][] m) {
	    transpose(m);
	    swapRows(m);
	}

	public static void rotateByNinetyToRight(int[][] m) {
	    swapRows(m);
	    transpose(m);
	}
	
	public static void printImg(int[][] image){
		for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
            	System.out.print(image[i][j]+" ");
            }
            System.out.println();
		}
	}
}
