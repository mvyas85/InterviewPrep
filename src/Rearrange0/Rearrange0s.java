 package Rearrange0;
/*
 * Given an array of ints = [6, 4, 0, 5, 0, 0, 0, 1, 0] move
 *  all non zero numbers to the left and zeros to the right. 
 *  How can you now improve your answer to O(n)? 
 */
public class Rearrange0s {
	

	public static void main(String args[]){
		int[] myArr = {6, 4, 0,0, 5, 0, 0, 0, 1, 0};

		printArr(myArr);
		
		reArrange(myArr);
System.out.println("After \n");
		printArr(myArr);
	}
	
	public static void reArrange(int[] arr){
		int len = arr.length;
		int start = 0;
		int end = len-1;
		
		while(start < end){
			
			while(arr[start] != 0 && start<end){
				start ++;
			}
			while(arr[end] == 0  && start<end){
				end --;
			}
			if(start == end){
				break;
			}
			swap(arr, start,end);
		}
	}
//	public static void reArrange(int[] arr){
//	
//		int len = arr.length;
//		int i =0,j=len -1;
//		while(i<j){
//	
//			while(i< j ){
//				
//				if(arr[i] == 0)
//					break;
//				i++;
//			}
//			
//			while(i<j){
//				
//				if(arr[j] != 0)
//					break;
//				j--;
//			}
//			if(i==j)
//				break;
//			
//			swap(arr,i,j);
//		}
//	}
	
	private static void swap(int[] arr, int i, int j) {
		System.out.println("\nSwapping arr["+i + "] ="+arr[i]+" arr["+j+ "] ="+arr[j]);
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j] = temp;
		
		printArr(arr);
	}
	public static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	
}
