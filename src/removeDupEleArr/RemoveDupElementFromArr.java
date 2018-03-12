package removeDupEleArr;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class RemoveDupElementFromArr {
	

	public static void main(String args[]){
		
		List<Integer> arr = Arrays.asList(4,5,6,2,2,5,6);
		

        int a[]={1,1,1,1,2,2,2,2,2,2,2,2,3,4,4,6,6,6,6,6};
//		System.out.println(removeElement(arr));
        a = removeElement(a);
        for(int b:a){
        	System.out.print(b+ " ");
        }
        
	}
	public static int removeElement(List<Integer> a) {
		
		//Even better solution add it in hashset all dups will be automatically removed!
	    Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		    
		    int count= 0;
		    for(int i = 0 ;i<a.size();i++){
		    	int ele = a.get(i);
		    	if(table.containsKey(ele)){
		    		count = table.get(ele);
		    	}
		        table.put (a.get(i), ++count);
		    }
		 
		    Set<Integer> keys = table.keySet();
		    Iterator<Integer> it = keys.iterator();
		    while(it.hasNext()){
		    	int key = (int) it.next();
		    	if(table.get(key) >1){
		    		it.remove();
		    	}
		    }
		    return table.size();
	}
	
	

	public static int[] removeElement(int arr[]) {
		for(int i = 1;i<arr.length;i++){
			if(arr[i] == arr[i-1]){
				arr = removeArrElem(arr,i);
				i = i-1;
			}
		}
		return arr;
	}
	private static int[] removeArrElem(int[] arr, int i) {
		for (int j = i;j<arr.length-1;j++){
			arr[j]= arr[j+1];
		}
		
		int[] dest = new int[arr.length-1];
		System.arraycopy(arr, 0, dest, 0, arr.length-1);
		return dest;
		
	}
}
