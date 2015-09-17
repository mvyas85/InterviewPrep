/*
 * 		String str = "hello world this is manisha";
		//ahsinam si siht dlrow olleh
		//manisha is this world hello
 */
package reverseStrNWords;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		//System.out.println(reverseStrRecursive(str));

		System.out.println("Reverse worlds:"+reverseWordsInStr(str));
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

	
	public static String reverseWordsInStr(String str){
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
}
