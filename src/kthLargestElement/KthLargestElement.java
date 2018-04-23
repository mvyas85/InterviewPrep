package kthLargestElement;

import java.util.PriorityQueue;
/**
 * 
 * 
 * 
 * 215. Kth Largest Element in an Array

Find the kth largest element in an unsorted array. 
Note that it is the kth largest element in the sorted order, not the kth distinct element.
For example,
Given [3,2,1,5,6,4] and k = 2, return 5.
brut force == > [1,2,3,4,5,6] == num[4] = 5 = length (6) - k+ 1;
Note: 
You may assume k is always valid, 1 ≤ k ≤ array's length.
 * @author vyasma1
 *
 */
public class KthLargestElement {

	public static void main(String args[]){
		int[] num = {3,2,1,5,6,4};
		System.out.println(findKthLargest(num,4));
	}
	public static int findKthLargest(int[] nums, int k) {

	    final PriorityQueue<Integer> pq = new PriorityQueue<>();
	    for(int val : nums) {
	        pq.offer(val);

	        if(pq.size() > k) {
	            pq.poll();
	        }
	    }
	    return pq.peek();
	}

}
