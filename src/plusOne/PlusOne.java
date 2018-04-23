package plusOne;
/**
 * 
 * 
 * 
 * 66. Plus One

Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.



 */
public class PlusOne {

	public static void main(String args[]){
		int[] arr = new int[]{4,9};
		plusOne(arr);
		
		for(int n:arr){
			System.out.print(n+ " ");
		}
	}

	
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        
        int[] ans = new int[digits.length+1];
        ans[0] = 1;
        
        return ans;
    }
    
    
    
	public static int[] plusOne1(int[] digits) {

		String num = "";
		for (int i = digits.length - 1; i >= 0; i--) {
			num = digits[i] + num;
		}

		int n = Integer.parseInt(num);
		n = n + 1;

		int[] ans = new int[(n+"").length()];
		int temp;
		int i = (n+"").length()-1;

		while (n > 0) {
			temp = n % 10;
			ans[i] = temp;
			n = n / 10;
			i--;
		}

		return ans;
	}
}
