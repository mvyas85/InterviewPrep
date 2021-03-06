package removeDupFromStrNoDuplicate2;

import java.util.HashMap;

public class Practice {
	public static void main(String args[]){
		String str ="ABCDA";
		
		//checkUniqueCharStr(str);
//		removeDuplicateFromString(str.toCharArray());
		

//		printStr(str.toCharArray());
		remDuplicateFormString(str.toCharArray());
	}
	public static void checkUniqueCharStr(String str){
		HashMap<Character,Integer> myMap = new HashMap<Character,Integer>();
		for(int i =0;i<str.length();i++){
			int x;
			if( myMap.containsKey(str.charAt(i))){
				x = myMap.get(str.charAt(i));
			}else{
				x = 0;
			}
			myMap.put(str.charAt(i), ++x);
		}
		boolean foundDups = false;
		for(int value :myMap.values()){
			if(value >1){
				foundDups = true;
				break;
			}
		}
		if(foundDups){
			System.out.println("Yes duplicate" );
		}else{
			System.out.println("No duplicates");
		}
	}
	
	/*
	 * Design an algorithm and write code to remove the duplicate 
	 * characters in a string without using any additional buffer 
	 * NOTE: One or two additional variables are fine An extra copy 
	 * of the array is not
	 *	FOLLOW UP
	 */
	
	public static void removeDuplicateFromString(char[] str){
		for(int i = 0; i<str.length -1 ;i++){
			char c = str[i];
			int j = i;
			while(str[j]!='\0' && j < str.length-1){
				j++;
				char next = str[j];
				if(c == next)
				{
					removeCharAtIndex(str, j);
					j--;
				}
			}
		}
		System.out.println(str);
	}
	private static void removeCharAtIndex(char[] str,int removeindex) {
		System.out.println("removing "+removeindex);
		int i;
		for(i =removeindex;i<str.length-1;i++){
			str[i] = str[i+1];
		}
		str[i]='\0';

	}
	
	
	
	
	
	public static void remDuplicateFormString(char[] arr){

		printStr(arr);
		for(int i =0;i<arr.length-2;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					removeCharacterAt(arr,j);
				}
			}
		}
	}
	private static void removeCharacterAt(char[] arr, int j) {
		while((j+1)<arr.length-1){
			arr[j] = arr[j+1];
			j++;
		}
		arr[j]='\0';
		
		System.out.println();
		printStr(arr);
	}
	
	
	private static void printStr(char[] str){
		for(int i=0;i<str.length;i++){
			System.out.print(str[i]);
		}
	}
}
	