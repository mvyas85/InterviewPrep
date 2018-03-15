package steppingNumbers;

import java.util.ArrayList;

/**
 * 
 * 	
Given N and M find all stepping numbers in range N to M

The stepping number:

A number is called as a stepping number if the adjacent digits have a difference of 1.
e.g 123 is stepping number, but 358 is not a stepping number

Example:

N = 10, M = 20
all stepping numbers are 10 , 12 
Return the numbers in sorted order.


 * @author vyasma1
 *
 */
public class SteppingNums {
	
	
	public static void main(String args[]){
		System.out.println(getSteppingNums(1,200));
	}
	
	public static ArrayList<Integer> getSteppingNums(int n,int m){
		 ArrayList<Integer> result = new ArrayList<Integer>();

		for(int i = n;i<=m;i++){
			boolean flag = true;
			String numStr = Integer.toString(i);
			int len = numStr.length();
			
			for(int j = 1;j<len;j++){
				if(Math.abs((numStr.charAt(j-1)-'0') - (numStr.charAt(j)-'0') ) != 1){
					flag = false;
					break;
				}
			}
			if(flag){
				result.add(i);
			}
		}
		return result;
	} 
}
