package swapping;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		System.out.println("Enter num a:");
		
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Enter num b:");
		
		
		int b = Integer.parseInt(sc.nextLine());
		
		a = a+b;
		b= a-b;
		a = a-b;
		
		System.out.println("Num a is : "+a +"Num b is : "+b);
		

	}

}
