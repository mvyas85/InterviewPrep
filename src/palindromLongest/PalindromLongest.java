package palindromLongest;

public class PalindromLongest {


	public static void main(String args[]) {
		System.out.println(longestPalindrome("ABBBIIIHII"));
	}
	
	public static String longestPalindrome(String s) {
	        int curLen = 0;
	        int start = -1;
	        char[] array = s.toCharArray();
	        for(int i = 0; i < array.length; i++) {
	        	int a = i - curLen - 1;
	        	int b = i - curLen ;
	        	System.out.println("Checking " +a+" "+b+ " ---- "+i);

	            if(isPalindrome(array, i - curLen - 1, i)) {
		        	System.out.println(s.substring(a,i)+"= " +a+" "+i);
	                start = i - curLen - 1;
	                curLen += 2;
	            } else if (isPalindrome(array, i - curLen, i)) {
		        	System.out.println(s.substring(b,i)+"= " +b+" "+i);
	                start = i - curLen;
	                curLen += 1;
	            }
	        }
	        return new String(array, start, curLen);
	    }
	    private static boolean isPalindrome(char[] array, int start, int end) {
	        if(start < 0) {
	            return false;
	        }
	        while(start < end) {
	            if(array[start++] != array[end--]) {
	                return false;
	            }
	        }
	        return true;
	    }
}
