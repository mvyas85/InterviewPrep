package addDigits;

/**
 
 258. Add Digits
 
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime? ???????????????/
 */
public class addDigits {

	public static void main(String args[]){
		System.out.println(addDigits2(139));
	}
    public static int addDigits2(int num) {
    	int ans = 0;
        String numStr = num + "";
        while (numStr.length() != 1){
        	ans =0 ;
	        while(num>0){
	        	ans += num%10;
	            num = num/10;
	        }
	        numStr = ans + "";
	        num = ans;
        }
        return ans;
    }
    public static int addDigits1(int num) {
        String numStr = num + "";
        while (numStr.length() >1){
            int sum=0;
            for(int i=0;i<numStr.length();i++){
                sum = sum + Integer.parseInt(numStr.charAt(i)+"");
            }
            numStr = sum+"";   
        }
        return Integer.parseInt(numStr);
    }
}
