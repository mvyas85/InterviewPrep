package palindromLinkedList;

public class rotateArray {
	
	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		int[] temp = new int[k];
		int t = nums.length - k;
		int s = t - 1;
		for (int i = 0; i < k; i++) {
			temp[i] = nums[t++];
		}
		for (int j = nums.length - 1; j >= k; j--) {
			nums[j] = nums[s--];
		}
		for (int z = 0; z < k; z++) {
			nums[z] = temp[z];
		}
	}
}
