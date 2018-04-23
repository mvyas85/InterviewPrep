package decodeWays;

public class DecodeWays {

	public static void main(String args[]){
		System.out.println(numDecodings("10"));
	}
	//Correct
    public static int numDecodings(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for(int i = 2; i <= n; i++) {
            int second = Integer.valueOf(s.substring(i-1, i));
            int lastTwo = Integer.valueOf(s.substring(i-2, i));
            if(second >= 1 && second <= 9) {
               dp[i] += dp[i-1];  
            }
            if(lastTwo >= 10 && lastTwo <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
    
    
    public static int numDecodings1(String s) {
        
        int count = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                continue;
            }
            else if(s.charAt(i)<=2 && i<s.length()-1 && s.charAt(i+1)<=6 ){
                count = count + 2;
            }else{
                count++;
            }
            
        }
        return count;
    }
}
