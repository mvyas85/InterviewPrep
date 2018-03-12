package sameSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Given an array with non negative numbers, divide the array into two
 *  parts such that the average of both the parts is equal. 
Return both parts (If exist).
If there is no solution. return an empty list.

Example:


Input:
[1 7 15 29 11 9]

Output:
[9 15] [1 7 11 29]

The average of part is (15+9)/2 = 12,
average of second part elements is (1 + 7 + 11 + 29) / 4 = 12

NOTE 1: If a solution exists, you should return a list of exactly 2 lists of integers A and B which follow the following condition :
* numElements in A <= numElements in B
* If numElements in A = numElements in B, then A is lexicographically smaller than B ( https://en.wikipedia.org/wiki/Lexicographical_order )

NOTE 2: If multiple solutions exist, return the solution where length(A) is minimum. If there is still a tie, return the one where A is lexicographically smallest.

NOTE 3: Array will contain only non negative numbers.
 */
public class SameSum {

    
    private static ArrayList<ArrayList<Integer>> permutationList = new  ArrayList<ArrayList<Integer>>();
    
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(19);
		a.add(5);
		a.add(38);
		a.add(22);
		a.add(44);
		a.add(12);
		a.add(17);
		a.add(35);
		
		ArrayList<ArrayList<Integer>> ans = avgset(a);
		
		for(int i = 0 ;i< ans.size();i++){
			
			ArrayList<Integer> temp = ans.get(i);
			System.out.print("[");
			for(int j = 0 ;j< temp.size();j++){
				System.out.print(temp.get(j)+ " ");
			}

			System.out.print("] ");
		}
		System.out.println();
    }
	//Correct one
	
    public static ArrayList<ArrayList<Integer>> avgset111(ArrayList<Integer> a) {
        Collections.sort(a);

    int totalSum = 0;
    int n = a.size();
    for (int i = 0; i < n; i++) totalSum += a.get(i);
    int[][][] matrix = new int[n][n / 2 + 1][totalSum / 2 + 1];
    // populate matrix backwards
    for (int i = n - 1; i >= 0; i--) {
        int val = a.get(i);
        for (int s = 0; s <= n / 2; s++) {
            for (int u = 0; u <= totalSum / 2; u++) {
                if (s == 0) {
                    matrix[i][s][u] = u == 0 ? 1 : 0;
                } else if (i + 1 >= n) {
                    matrix[i][s][u] = s == 1 && val == u ? 1 : 0;
                } else if (u < val) {
                    matrix[i][s][u] = matrix[i + 1][s][u];
                } else { // s > element
                    matrix[i][s][u] = matrix[i + 1][s - 1][u - val] == 1 ? 1 : matrix[i + 1][s][u];
                }
            }
        }
    }
    for (int s = 1; s <= n / 2; s++) {
        // the solution has an integral sum on both left and right
        if (s * totalSum % n != 0) continue;
        int goal = totalSum * s / n;
        if (matrix[0][s][goal] == 1) {
            ArrayList<Integer> left = new ArrayList<Integer>();
            int idx = 0;
            int len = s;
            int sum = goal;
            while (len > 0) {
                while (len >= 1 && sum >= a.get(idx - left.size()) && idx < n - 1 
                    && matrix[idx + 1][len - 1][sum - a.get(idx - left.size())] == 0) {
                        idx++;
                }
                int val = a.get(idx - left.size());
                a.remove(idx - left.size());
                left.add(val);
                sum -= val;
                len--;
                idx++;
            }
            ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
            res.add(left);
            res.add(a);
            return res;
        }
    }
    return new ArrayList<ArrayList<Integer>>();
}
	
	
	
	//Incorrect ones
    public static ArrayList<ArrayList<Integer>> avgset(ArrayList<Integer> a) {
    	
    	ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    	ArrayList<SameValueArray> sameValArr = new ArrayList<SameValueArray>();

    	int[] intArr = new int[a.size()];
    	
    	for(int i = 0 ; i<intArr.length;i++){
    		intArr[i]= a.get(i);
    	}
    	
    	findPermutations(intArr,0,a.size()-1);
    	
    	for(int k = 0;k<permutationList.size();k++){
	    	for (int top=0;top<permutationList.get(k).size();top++){
		    	for (int i=0;i<permutationList.get(k).size();i++){
		
					ArrayList<Integer> oneSide = new ArrayList<Integer>();
		    		ArrayList<Integer> otherSide = new ArrayList<Integer>();
		    		
		    		
		    		for(int j = i ;j<permutationList.get(k).size();j++){
		    			oneSide.add(permutationList.get(k).get(j));
		    		}
		    		
		    		
		    		otherSide.addAll(a);
		    		otherSide.removeAll(oneSide);
		    		System.out.println("\n ");
		    		System.out.print("Side1 ======== ");
		    		printArryList(oneSide);
		    		System.out.println(" = "+avgOfArr(oneSide));
		    		System.out.print("Side2 ======= ");
		    		printArryList(otherSide);
		    		System.out.println(" = "+avgOfArr(otherSide));
		    		
		    		if(avgOfArr(oneSide) == avgOfArr(otherSide)){
		    			String st1 = hasPair(sameValArr,oneSide)?"==============HAVE PAIR=====":"";
			    		System.out.println("============ "+st1);
		    			if(!hasPair(sameValArr,oneSide)){
			    			SameValueArray match = new SameValueArray();
			    			match.setLeftRight(oneSide,otherSide);
			    			sameValArr.add(match);
			    		}
		    		}
		    	}   
		    	System.out.println("\n==========");
		    	rotateArr(permutationList.get(k));
		    	System.out.print("new list= ");
		    	printArryList(permutationList.get(k));
	    	}
    	}
    	
    	if(sameValArr.size() == 1){
    		ans.add(sameValArr.get(0).getLeft());
    		ans.add(sameValArr.get(0).getRight());
    		return ans;
    	}
    	return null;
    }
    

	private static boolean hasPair(ArrayList<SameValueArray> sameValArr,ArrayList<Integer> left){
		if(sameValArr.size()<1){
			return false;
		}
		boolean flag = true;
		for(int i = 0 ;i <sameValArr.size();i++){
			//Check left side
			ArrayList<Integer> tempLeft = new ArrayList<Integer>();
			ArrayList<Integer> tempRight = new ArrayList<Integer>();
			tempLeft.addAll(sameValArr.get(i).getLeft());
			tempRight.addAll(sameValArr.get(i).getRight());
			
			if((tempLeft.removeAll(left) && !tempLeft.isEmpty())||(tempRight.removeAll(left) && !tempRight.isEmpty())){
				flag = false;
				break;
			}
			
		}
		return flag;
	}
	private static void findPermutations(int[] arr, int start, int end) {
		if(start == end){
			ArrayList<Integer> list = new ArrayList<Integer>(arr.length);
			for (int i=0; i<arr.length; i++)
			{
				list.add(arr[i]);
			}
			permutationList.add(list);
			System.out.println(Arrays.toString(arr));
		}
		for(int i = start;i<=end;i++){
			swap(arr,start,i);
			findPermutations(arr,start+1,end);
			swap(arr,start,i);
		}
	}
	
	private static void swap(int[] arr, int a, int b) {

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	private static void rotateArr(ArrayList<Integer> arr){
    	Integer temp = arr.get(0);
    	arr.remove(temp);
    	arr.add(temp);
    }
    
	private static void printArryList(ArrayList<Integer> arr){
		for(int val:arr){
			System.out.print(val+" ");
		}
	}
    
	private static int avgOfArr(ArrayList<Integer> arr) {
		if(arr.size() == 0 ){
			return 0;
		}
		int sum=0;
		for(int val:arr){
			sum += val;
		}
		return sum/arr.size();
	}

}

class SameValueArray{
	private ArrayList<Integer> left;
	private ArrayList<Integer> right;
	private int total;
	private int smallestLen;
	
	public SameValueArray(){
		 left = new ArrayList<Integer>();
		 right = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getLeft() {
		return left;
	}

	public void setLeftRight(ArrayList<Integer> left,ArrayList<Integer> right) {
		this.left = left;
		this.right = right;
		
		total = sumOfArr(left);	
		smallestLen = (left.size()<right.size())?left.size():right.size();
	}
	
	private static int sumOfArr(ArrayList<Integer> arr) {

		int sum=0;
		for(int val:arr){
			sum += val;
		}
		return sum;
	}

	public ArrayList<Integer> getRight() {
		return right;
	}

	public int getTotal() {
		return total;
	}

	public int getSmallestLen() {
		return smallestLen;
	}	
	
	private void resetLeftRight(){

		ArrayList<Integer> temp = new ArrayList<Integer>();
		if(left.size() > right.size()){
			temp = left;
			right = left;
			left = temp;
		}else if(left.size() == right.size()){
			//Reorder to maintain Lexicographical_order
		}else{
			// it is in right order
		}
	}
}
