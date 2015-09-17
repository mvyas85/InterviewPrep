package palindromeNum;

public class PalindromeNum {
	public static void main(String args[]){
		int num = 5644765;
		isNumPalindrome(num);
	}
	public static void isNumPalindrome(int x){
		if (x <10){
			System.out.println("Number "+ x + " is Palindrome");
			return;
		}
		
		String str = new Integer(x).toString();
		int len = str.length();
		boolean flag = false;
		for(int i=0,j=len-1;i<len/2;i++,j--){
			if(str.charAt(i)!=str.charAt(j)){
				flag = false;
				break;
			}
			flag=true;
		}
		String isORNot = (flag)? " is ":" is not ";
		
		System.out.println("Number "+ x + isORNot + "Palindrome");
		
	}
}
