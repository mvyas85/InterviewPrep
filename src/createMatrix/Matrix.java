package createMatrix;
/*
 * create metrix 
 * 
 * Enter value for x:
 * 3
 * Enter value for y:
 * 4
 * 
 * 0  1  2  3  
 * 1  1  2  3  
 * 2  2  4  6  
 * 3  3  6  9  
 * 4  4  8  12  
 * 
 * 
 */
import java.util.Scanner;

public class Matrix {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value for x:");
		int x = in.nextInt();
		System.out.println("Enter value for y:");
		int y = in.nextInt();
		createMatrix(x,y);
	}

	private static void createMatrix(int x, int y) {
		int j =0;
		for(int i =0;i<=y;i++){
			for (j =0;j<=x;j++){
				if(i==0){
					System.out.print(j+ "  ");
				}else if(j==0){
					System.out.print(i+ "  ");
				}else{
					System.out.print(i*j+"  ");
				}
			}
			System.out.println();
		}
	}
	
}
