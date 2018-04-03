package plusOne;

public class PlusOne {

	public static void main(String args[]){
		System.out.println(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
	}

	public static int[] plusOne(int[] digits) {

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
