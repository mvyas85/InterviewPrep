package xRaiseToy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0,y = 0;
		System.out.println("Enter value of x for x^y:");
		
		try {
			 x = Integer.parseInt(br.readLine());
			System.out.println("Enter value of y for x^y:");
			
			y = Integer.parseInt(br.readLine());
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int ans = 1;
		for (int i=0;i<y;i++){
		 ans *= x;
		}
		
		System.out.println("Ans is "+ ans);
		System.out.println("Ans is "+ Math.pow(x, y));
	}
	
}
