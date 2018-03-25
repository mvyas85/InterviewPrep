 package Rearrange0;
/*
 * Given an array of ints = [6, 4, 0, 5, 0, 0, 0, 1, 0] move
 *  all non zero numbers to the left and zeros to the right. 
 *  How can you now improve your answer to O(n)? 
 */
public class Rearrange0s {
	

	public static void main(String args[]){
		int[] myArr = {0,1,0,3,12};
		int[] myArr2 = {0,1,0,3,12};

		printArr(myArr);
		
		moveZeroes(myArr);
		System.out.println("After \n");
		printArr(myArr);

		System.out.println("\n\n\n\n");
		reArrange(myArr2);
		System.out.println("After22 \n");
		printArr(myArr2);
	}
	
	//O(n)
	static void moveZeroes(int[] nums) {
	    int lastNonZeroFoundAt = 0;
	    // If the current element is not 0, then we need to
	    // append it just in front of last non 0 element we found. 
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] != 0) {
	            nums[lastNonZeroFoundAt++] = nums[i];
	        }
	    }
	    // After we have finished processing new elements,
	    // all the non-zero elements are already at beginning of array.
	    // We just need to fill remaining array with 0's.
	    for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
	        nums[i] = 0;
	    }
	}
	
	public static void reArrange(int[] nums){
        int start = 0;
        int end = nums.length-1;
        
        while(start<end){
            while(nums[start]!=0 && start<end){
                start++;
            }
            while(nums[end]==0 && start<end){
                end--;
            }
            swap(nums,start,end);
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
//		System.out.println("\nSwapping arr["+i + "] ="+arr[i]+" arr["+j+ "] ="+arr[j]);
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j] = temp;
		
	}
	public static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	
}
