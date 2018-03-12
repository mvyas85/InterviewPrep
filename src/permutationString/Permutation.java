package permutationString;

public class Permutation {

	public static void main(String args[]){
		  String str = "ABC";
	        int len = str.length();
	        permutation(str, 0, len-1);
	}
	
	public static void permutation(String str, int start, int end){
		if(start == end){
            System.out.println(str);
		}
		
		for( int i = start ; i <= end ; i ++ ){
			str = swap(str,start, i);
			permutation(str,start+1,end);
			str = swap(str,start,i );
		}
	}

	private static String swap(String str, int i, int j) {
		
		char[] arr = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp; 
		
		return String.valueOf(arr);
	}
}
