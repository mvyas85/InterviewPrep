package replaceSpaces;
/*
 * repalce all the spaces in the string with '%20"
 */
public class ReplaceSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is my str";
		
		System.out.println(replaceSpaces(str));
		System.out.println(replaceSpaces(str));

	}

	public static String replaceSpaces(String str){
			return str.replaceAll(" ", "%20"); 
		
	}
	
	//Without using function
	public static String replaceSpaces2(String str){
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder("");
		for(int i =0;i<words.length;i++){
			result.append(words[i]);
			if(i != words.length-1)
				result.append("%20");
		}
		return result.toString();
	}
	//Without using function
	public static String replaceSpaces3(String str){
		
		StringBuilder str3 = new StringBuilder();

		for(int i =0;i<str.length();i++){
			if(str.charAt(i)!= ' '){
				str3.append(str.charAt(i));
			}else{
				str3.append("%20");
			}
		}
		return str3.toString();
	}
}