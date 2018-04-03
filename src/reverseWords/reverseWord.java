package reverseWords;

public class reverseWord {
	public static void main(String args[]){
		String str = "Hello World how are you";
		StringBuilder  rev= new StringBuilder("");
		
		String[] splitStr = str.split(" ");
			
		int len = splitStr.length;
		
		for (int i = len-1;i>=0;i--){
			rev = rev.append(splitStr[i]).append(" ");
		}
		
		  System.out.println(rev);
		  System.out.println(6/2*(1+2));
	}
}
