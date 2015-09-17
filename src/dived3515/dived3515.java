package dived3515;

import java.util.Scanner;

public class dived3515 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int x = Integer.parseInt(sc.nextLine());
		
		if (x%15 ==0){
			System.out.println("number is divisable by 15 ");
		}
		else if (x%5 == 0){
			System.out.println("number is divisable by 5");
		}
		else if (x%3 == 0 ){
			System.out.println("number is divisable by 3");
		}
		else {
			System.out.println("number is divisable not non of 3,5,15");
		}
	}
}
