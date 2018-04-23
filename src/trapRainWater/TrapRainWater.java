package trapRainWater;

public class TrapRainWater {

	public static void main(String args[]){
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(arr));
	}
	public static int trap(int[] height){

		int l = 0;
		int r = height.length-1;
		int leftMax = height[l];
		int rightMax = height[r];
		int water = 0;
		
		while(l<=r){
			if(leftMax<=rightMax){
				leftMax = Math.max(leftMax, height[l]);
				water += (leftMax-height[l]);
				l++;
			}else{
				rightMax = Math.max(rightMax, height[r]);
				water += (rightMax - height[r]);
				r--;
			}
		}
		return water;
	}
	
}
