package reverseNum;

public class reverseNum {
	public static void main(String args[]){
		
		int num = 123;

		System.out.println(reverse(num));
//		int temp;
//		int revNum =0;
//		while(num!=0){
//			temp = num %10;
//			revNum = temp + (revNum *10)  ;
//
//			num = num/10;
//		}
//		System.out.println("Reverse tring is "+revNum);	
	}
	
    public static int reverse(int x) {
        boolean isNeg = false;
        if(x<0){
            x = x * -1;
            isNeg = true;
        }
        int len = ( x+ "").length();
        int temp = 0;
        int ans = 0;
        while(x!=0){
            temp = x%10;
            ans = ans + temp * (int)Math.pow(10,--len);
            x = x/10;
        }
        return isNeg ? ans*-1 : ans;
    }
}
