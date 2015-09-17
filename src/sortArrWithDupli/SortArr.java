package sortArrWithDupli;

import java.util.Arrays;

public class SortArr {
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,2,3,4};
		int temp;
		boolean flag = true ;
		
		//Arrays.sort(arr);
		
		while(flag){
			flag = false;
			for (int i =0;i<arr.length-1;i++){
				if(arr[i]>arr[i+1]){
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					flag = true;
				}
			}
		}
		for (int i =0;i<arr.length-1;i++){
			System.out.println(arr[i]);
		}
	}
}
