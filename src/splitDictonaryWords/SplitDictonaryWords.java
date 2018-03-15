
package splitDictonaryWords;

import java.util.Arrays;

/**
 * Divide a string "ilikethebluesky" to "i like the blue sky " from a dictionary "l,like,the,blue,sky...."
 * @author vyasma1
 *
 */
public class SplitDictonaryWords {

	static String[] dict = {"i","like","the","blue","sky"};
	public static void main(String args[]){
		
		String str = "ilikethebluesky";
		
		System.out.println(splitWords(str));
	}
	private static String splitWords(String str) {
		
		StringBuilder sb = new StringBuilder();
		String word = "";
		for(int i = 0 ; i < str.length();i++){
			word += str.charAt(i);
			if(isWordExistsInDict(word)){
				sb.append(word);
				word="";

				if(i!=str.length()-1){
					sb.append(" ");
				}
			}
		}
		return sb.toString();
		
	}
	private static boolean isWordExistsInDict(String word) {
		Arrays.sort(dict);
		int index = Arrays.binarySearch(dict, word);
		
		if(index >=0){
			return true;
		}
//		for(int i = 0 ; i < dict.length;i++){
//			if(dict[i].equals(word)){
//				return true;
//			}
//		}
		return false;
	}
}
