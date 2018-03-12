package findIandJwithK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example :

Input :

A : [1 5 3]
k : 2
Output :

1
as 3 - 1 = 2

Return 0 / 1 for this problem.

 * @author vyasma1
 *
 */
public class FindIandJwithKinArr {

	public static void main(String args[]){
		
		List<Integer> arr = Arrays.asList(38,78,77,59,38,33,79,38,24,39,29,93,15,9,63,13,63,75,39,81,91,13,34,24,12,59,19,64,20,36,71,82,26,56,94,36,91,7,78);
		
		//32,77,28,19,21,67,15,53,25,82,52,8,94,50,30,37,39,9,43,35,48,82,53,16,20,13,95,18,67,77,12,93,0 
		int k = 85;
		
		int ans = findK(arr,k);
		int ans2 = findKusingBinarySearch(arr,k);
		System.out.println(ans);
		System.out.println(ans2);
		
	}
	
	public static int findK(final List<Integer> arr,int k){
		
		Collections.sort(arr);
		
		for(int i = 0;i<arr.size();i++){
			System.out.print(arr.get(i)+ " ,");
		}
		System.out.println();
		
		for(int i = 0 ; i < arr.size() - 1 ; i++){
			for(int j = 0 ; j < arr.size() ;j++){
				
				System.out.println("i = "+ i+ " j = "+j +"  == ["+arr.get(j)+"] "+ "-["+arr.get(i)+"] "+ " ========"+ (arr.get(j) - arr.get(i)));
				if((i != j)&&arr.get(j) - arr.get(i) == k ){
					return 1;
				}
			}
		}
		return 0;
		
	}
	
	public static int findKusingBinarySearch(final List<Integer> arr, int k){
		Collections.sort(arr);
		
		int start = 0;
		int end = arr.size() -1;
		
		while(end>start){
			if(arr.get(end)-arr.get(start) == k){
				return 1;
			}else if(arr.get(end)-arr.get(start) > k){
				end--;
			}else{
				start++;
			}
		}
		return 0;
		
	}
}
