package changeCharinStr;
/*
 * Write a Java program to replace certain characters from String like
 * public String replace(String str, char ch)
 */
public class ChangeCharInStr {

	public static void main(String[] args) {
		String str = "My house is on river bank!";
		System.out.println(replace(str,'o','m'));
		System.out.println(replaceCharAt(str, 7, 'd'));
	}
	
	public static String replace(String str, char replaceChar, char newChar){
		char ch;
		StringBuilder replacesStr = new StringBuilder("");
		for(int i =0;i<str.length();i++){
			ch = str.charAt(i);
			if(ch == replaceChar){
				ch = newChar;
			}
			replacesStr.append(ch);
		}
		return replacesStr.toString();
	}
	
	  private static String replaceCharAt(String s, int i, char c) {
	        StringBuffer buf = new StringBuffer(s);
	        buf.setCharAt(i, c);
	        return buf.toString();
	    }
}
