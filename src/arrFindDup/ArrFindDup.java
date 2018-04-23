package arrFindDup;
/**

287. Find the Duplicate Number
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), 
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.

 */
public class ArrFindDup {
	

	public static void main(String args[]){
		System.out.println(findDupe(new int[]{1,4,0,3,3,2}));
	}
	
	public static int findDupe(int[] arr){
		
		
//		for(int i = 0;i< arr.length;i++){
//			arr[i] = --arr[i];
//		}
		
		int slow = arr.length - 1;
		int fast = arr.length - 1;
		
		do{
			slow = arr[slow];
			fast = arr[arr[fast]];
		}while(slow != fast);
		
		return 0;
	}

}
