/*
 * if given 1 to N = 9
 */
package Num1DuplicateIn1toN;

import java.util.Arrays;
import java.util.Hashtable;

public class DuplicateInOneTo10 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,7,8,9};

//		Hashtable<Integer,Integer> hash = new Hashtable<Integer,Integer>();
//		int value = 0;
//	
//		for (int i =0;i<arr.length;i++){
//			if(hash.get(arr[i]) == null)
//				value = 0;
//			else
//				value = hash.get(arr[i]) ;
//			hash.put(arr[i], value+1);
//		}
//		
//		int dupli=0;
//		
//		for(int i=0;i<arr.length;i++){
//			if(hash.get(arr[i])>1){
//				dupli = arr[i];
//			}
//		}
//
//		System.out.println(dupli+" is duplicate");
		
		System.out.println("Duplicate number is "+duplicateNum1(arr,9));
	}
	

	public static int duplicateNum1(int[] arr,int n){
		
		Arrays.sort(arr);
		
		for(int i = 1;i<arr.length;i++){
			if(arr[i-1] != i){
				return arr[i-1];
			}
		}
		return 0;
	}
	
	
	public static int duplicateNum(int[] arr,int n){
		
		int actualTotal = 0;
		
		for (int i=0;i<arr.length;i++){
			actualTotal += arr[i];
		}
		
		int expectedTotal = n * (n+1) /2;
		
		
	//	System.out.println("Actual = "+actualTotal + " expected="+expectedTotal);
		return actualTotal-expectedTotal;
	}

}
