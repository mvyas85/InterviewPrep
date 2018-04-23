package rotateArr;

public class RotateArray {

	public static void main(String args[]){
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		rotate(arr,3);
		
		for(int n : arr){
			System.out.print(n+",");
		}
	}
	
	
    public static void rotate(int[] nums, int k) {
    	
        int[] temp = new int[k];
        int len = nums.length-1;
        
        for(int i=0;i<k;i++){
            temp[i] = nums[len-i];
        }
        
        for(int i = len,j=1;i>=k;i--,j++){
            nums[i] = nums[nums.length-k-j];
        }
        
        for(int i=0;i<k;i++){
            nums[i] = temp[i];
        }
        
//        k = k % nums.length; 
//        int[] temp = new int[k];
//        int kFromLast = nums.length - k;
//        int last = kFromLast-1;
//        
//        for (int i = 0; i < k; i++) {
//            temp[i] = nums[kFromLast++];
//        }
//        for (int j = nums.length - 1; j >= k; j--) {
//            nums[j] = nums[last--];
//        }
//        for (int z = 0; z < k; z++) {
//            nums[z] = temp[z];
//        }
    }
}
