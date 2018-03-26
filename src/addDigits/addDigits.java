package addDigits;
public class addDigits {

	public static void main(String args[]){
		System.out.println(addDigits(38));
	}
    public static int addDigits(int num) {
        while(num<=10){
            num = num/10+ num%10;
        }
        return num;
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
