package removeDuplicateFromIntArr;

import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDuplicateCollection {

	public static void main(String args[]){
		
		int[] arr = {66,4,33,22,3,3, 5,2,1,3,2};
		
		TreeSet<Integer> noDup = new TreeSet<Integer>();
		
		for(int i =0;i<arr.length;i++){
			noDup.add(arr[i]);
		}
		
		System.out.println("Printing Array now");
		
		Iterator<Integer> it = noDup.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
		
	}
	
}
