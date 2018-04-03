package addDigits;
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
