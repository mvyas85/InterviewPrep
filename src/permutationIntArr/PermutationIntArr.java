package permutationIntArr;

import java.util.Arrays;

public class PermutationIntArr {

	public static void main(String args[]){
		int[] arr = new int[]{1,3,3};
		
		permutation(arr,0,arr.length-1);
	}

	private static void permutation(int[] arr, int start, int end) {

		if(start == end){
			System.out.println(Arrays.toString(arr));
		}
		
		for(int i = start;i<=end;i++){
			swap(arr,start,i);
			permutation(arr,start+1,end);
			swap(arr,start,i);
		}
		
	}

	private static void swap(int[] arr, int a, int b) {

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
}
