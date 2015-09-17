package randomSuffle;

import java.util.Random;

public class Suffle {
	public static void main(String args[]){
		int[] myArr = {1,2,3,4,5,6,7,8,9,0};
		

		System.out.println("Before suffle :");
		for(int i=0;i<myArr.length;i++){
			System.out.print(myArr[i]+" ");
		}
		
		suffleArr(myArr);
		System.out.println("After suffle :");
		for(int i=0;i<myArr.length;i++){
			System.out.print(myArr[i]+" ");
		}
		
	}
	
	public static void suffleArr(int[] arr){
		Random rand = new Random();
		int len = arr.length;
		for(int i =0;i<arr.length;i++){
			swap(arr, i,rand.nextInt(len - i + 1));
		}
		
	}
	public static void swap(int[] arr, int indexX,int indexY){
		System.out.println("indexX = "+ indexX+"indexY = "+ indexY);
		int temp = arr[indexX];
		arr[indexX] = arr[indexY];
		arr[indexY] = temp;
	}
}
