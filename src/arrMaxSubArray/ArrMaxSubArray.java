package arrMaxSubArray;
public class ArrMaxSubArray {

	public static void main(String args[]){
		System.out.println(maxSubArray(new int[]{1, -1, -2,2, -1}));
	}
	
	public static int maxSubArray(int[] arr){
		int max = arr[0];
		int sum = arr[0];
		
		for(int i=1;i<arr.length;i++){
			sum = arr[i] + ((sum<0)? 0 : sum);
			max = Math.max(sum, max);
			
		}
		
		return max;
	}

}
