package palindromLongest;

public class PalindromLongest {


	public static void main(String args[]) {
		System.out.println(longestPalindrome("babad"));
	}
	
	public static String longestPalindrome(String s) {
	        int curLen = 0;
	        int start = -1;
	        char[] array = s.toCharArray();
	        for(int i = 0; i < array.length; i++) {
	            if(isPalindrome(array, i - curLen - 1, i)) {
	                start = i - curLen - 1;
	                curLen += 2;
	            } else if (isPalindrome(array, i - curLen, i)) {
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
