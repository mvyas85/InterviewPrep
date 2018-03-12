package changeCharinStr;
/*
 * Write a Java program to replace certain characters from String like
 * public String replace(String str, char ch, char newCh)
 */
public class ChangeCharInStr {

	public static void main(String[] args) {
		String str = "My house is on river bank!";
		System.out.println(replace(str,'o','m'));
		System.out.println(replace1(str, 'o', 'd'));
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
	  
	  private static String replace1(String str, char replaceChar, char newChar){
		  char[] chars = str.toCharArray();
		  
		  for(int i =0 ;i<chars.length;i++){
			  if(chars[i] == replaceChar){
				  chars[i] = newChar;
			  }
		  }
		  
		  return String.valueOf(chars);
	  }
}
