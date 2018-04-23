package reverseInteger;

public class ReverseInt {

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		
String beginWord = "";
        char[] word = beginWord.toCharArray();
        
        
        
	}
	
    public static int reverse(int x) {
        int ans = 0;
        int nx = new Integer(Math.abs(x)).toString().length();
        for(int i = 0 ;i<nx;i++){
            int t = x %10;
            int check = ans* 10;
            if(check/10 != ans){return 0;}
//            if(ans*10 != ans/10){return 0;}
            ans = t + (ans*10);
            x = x/10;
            
        }
        return ans;
    }

}
