package sortArr;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


public class Insertion {
	public static ArrayList<Integer> intInsertionSort(int [] a){
		Set<Integer> output = new TreeSet<Integer>();

		for (int i: a){
			output.add(i);
		}
		
		return new ArrayList<Integer>(output);
	}
	
    public static void main(String[] args) {
        int[] input = { 4, 2,23, 9, 6, 23, 12, 34, 0, 1 };

        ArrayList<Integer> arr = intInsertionSort(input);
        
        printNumbers(arr);
 
    }
    
    private static void printNumbers(ArrayList<Integer> arr) {
        for(int i =0;i<arr.size();i++){
        	System.out.println(arr.get(i));
        }

    }
 }
