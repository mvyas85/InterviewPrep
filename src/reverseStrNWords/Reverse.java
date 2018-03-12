/*
 * 		String str = "hello world this is manisha";
		//ahsinam si siht dlrow olleh
		//manisha is this world hello
 */
package reverseStrNWords;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		sc.close();

		//System.out.println(reverseStrRecursive(str));

		String str = "This is an easy Java Program";
		System.out.println("Before:"+str.length());
		System.out.println(""+reverseWordsInStr3("This is an easy Java Program"));
		System.out.println("After:"+reverseWordsInStr3("This is an easy Java Program").length());
	
	}

	public static String reverseStr4(String str){
//		This is an easy Java Program
//		sihT si na ysae avaJ margorP
		
		String words[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i<words.length;i++){
			sb.append(new StringBuilder(words[i]).reverse().toString());
			sb.append(" ");
		}
		return sb.toString();
		
	}
	public static String reverseStr(String str){
		int len = str.length();
		StringBuilder revStr = new StringBuilder();
		for(int i=len-1;i>=0;i--){
			revStr.append( str.charAt(i));
		}
		return revStr.toString();
	}
	static String str = "";
	public static String reverseStrRecursive(String str){
		
		if(str.length() == 1){
			return str;
		}
		else{
			str = str.charAt(str.length()-1) + reverseStrRecursive( str.substring(0, str.length()-1));
		}
		return str;
	}

	
	public static String reverseWordsInStr3(String str){
		String words[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i =0 ; i<words.length;i++){
			for(int j = words[i].length()-1;j>=0;j--){
				sb.append(words[i].charAt(j));
			}
			if(i != words.length-1){
				sb.append(" ");
			}	
		}
		return sb.toString();
	}
	
	public static String reverseWordsInStr1(String str){
		int spaceIndex,end = str.length();
		String revWords ="";
		for(int i=str.length()-1;i>=-1;i--){
			if( i == -1 || str.charAt(i) == ' '){
				spaceIndex = i;
				for(int j=spaceIndex+1;j<end;j++)
				{
					revWords += str.charAt(j);
				}
				end = spaceIndex;
				revWords += " ";
			}
		}
		return revWords;
	}
	
	public static String reverseWordsInStr(String str){
		int spaceIndex = -1;
		StringBuilder revWords = new StringBuilder();
			for(int i=0;i<str.length();i++){
			char c= str.charAt(i);
			if( c == ' ' || i == str.length()-1){
				for(int j=i-1;j>spaceIndex;j--)
				{
					if(i == str.length()){j = i;}
					revWords.append(str.charAt(j));
				}
				spaceIndex = i;
				revWords.append(" ");
			}
		}
		revWords.append('\0');
		return revWords.toString();
	}
}
