package stringToInt;

public class StringToInt {
	public static void main(String args[]){
		System.out.println("MIN = "+Integer.MIN_VALUE);
		System.out.println("MAX =  "+Integer.MAX_VALUE);
//		System.out.println(2147483640+8	);
		System.out.println(-2147483648+2147483640	);
		System.out.println(myAtoi("2147483648"));
	}
    public static int myAtoi(String str) {
        str = str.trim();
        boolean isSignedInt = false;
        int digit=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == '-' && i == 0){
                isSignedInt = true;
                continue;
            }
            else if(Character.isDigit(c)){
                int temp = digit* 10;
                if(temp/10 != digit){
                	return isSignedInt ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                	}
                int cVal = Integer.parseInt(c+"");
                if(temp >= Integer.MAX_VALUE - 7 && cVal > 7)
                {
                    return isSignedInt ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                
                int temp2 = temp + Integer.parseInt(c+""); //2147483640 + 8 = -2147483648
                System.out.println(temp2 - temp );
                if(temp2 - temp != Integer.parseInt(c+"")){
                    return isSignedInt ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                digit = temp2;
                
            }else{
                break;
            }
        }
        return isSignedInt ? (digit * -1): digit;
    }
}
