package stringOrInt;

import java.util.Scanner;

public class StringOrInt {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String str = sc.nextLine();
//		try{
//			x = Integer.parseInt(str);
//		}
//		catch(NumberFormatException e){
//			System.out.println("Its not");
//			x=0;
//		}
//		if(x!=0)
//			System.out.println("Its is");
		
		System.out.println("Ans " + CheckIsDigit(str));

	}
	
	public static boolean CheckIsDigit(String str){
		if(str.length() < 1){
			return false;
		}
		boolean check = false;
		for(int i =0;i<str.length();i++){
			char c = str.charAt(i);
			if(Character.isDigit(c))
			{
				check = true;
			}
			else
			{
				check = false;
				break;
			}
				
		}
		
		return check;
	}

}
