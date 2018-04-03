package palindromeStr;

public class palindromeStr {

	public static void main(String args[]){
		String test = "ABCCBA";
		
		
		boolean ans = isPalindrome(test);
		
		String isORnot = (ans ) ? "is":"is not";
		System.out.println("Given string "+ isORnot +" palindrome");
	}
	public static boolean CheckPalindrome(String test){
		
		int len = test.length();
		boolean flag = false;
		if(len == 1){
			return true;
		}
		for(int i=0,j=len-1;i<len/2;i++,j--){
			if(test.charAt(i)==test.charAt(j)){
				flag = true;
				continue;
			}
			else{
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	
	public static boolean isPalindrome(String str){
		int l = 0;
		int r = str.length()-1;
		
		while (l<r){
			if(str.charAt(l++) != str.charAt(r--)){return false;}
		}
		return true;
	}
}
/*

public static void main(String args[]){
	String str = "aeddxea";
	
	int len = str.length();
	int i,begining = 0;
	int end = len -1;
	int middle = ( len-1 )/2;
	
	
	for (i =begining;i<=middle;i++){
		if(str.charAt(begining) == str.charAt(end))
		{
			begining ++;
			end --;
		}
		else
			break;
			
	}
	if (i== middle+1)
		System.out.println("palindrome");
	else
		System.out.println("Not palindrome");
	
}*/