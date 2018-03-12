package majorityEle;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

/**
 * Given an array of size n, find the majority element. The majority 
 * element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element 
always exist in the array.

Example :

Input : [2, 1, 2]
Return  : 2 which occurs 2 times which is greater than 3/2. 
 * @author vyasma1
 *
 */
public class MajorityElement {
	public static int majorityElement(final List<Integer> a) {
	    
	    if(a.size() == 0){
	    	return -1;
	    }else if(a.size() == 1){
	    	return a.get(0);
	    }
	    
		//CORRECT
	    Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
	    
	    for(int i =0;i<a.size();i++){
	        int val =0;
	        int searching = a.get(i);
	        if(table.containsKey(searching)){
	            val = table.get(searching);
	            table.put(searching, ++val);
	        }else{
	            table.put(searching, ++val);
	        }
	    }
	    
	    Set<Integer> keys = table.keySet();
	    
	    int maj = -1;
	    for(int key : keys){
	   // 	System.out.println("Math.floor "+Math.floor(a.size()/2));
	        if(table.get(key) >= Math.floor(a.size()/2)){
	            if(table.get(key)>=maj){
	                maj = key;
	            }
	        }
	    }
	    
	    return maj;
	}
	
    public static void printTable(Hashtable<Character,Integer> table){
        Set<Character> keySet = table.keySet();
        for(char c: keySet){
        	System.out.println(c+ " = " +table.get(c));
        }
    	
    }
    
//	public static int majorityElement2(final List<Integer> A) {
//	    
//	    if(A.size() == 0){
//	    	return -1;
//	    }else if(A.size() == 1){
//	    	return A.get(0);
//	    }
//	    int len =A.size();
//	    int[] val = new int[A.size()];
//	    
//	    for(int i= 0;i<len;i++){
//	    	val[i]++
//	    }
//	    
//	    return -1;
//		
//	}

    	public static int majorityElement1(final List<Integer> A) {
    	    
    	    if (A == null)
    	        return -1;
    	        
    	    int maj = A.get(0);
    	    int count = 1;
    	    int n = A.size();
    	    
    	    for (int i = 1; i < n; i++) {
    	        if (A.get(i) == maj) {
    	            count++;
    	        } else if (count == 1) {
    	            maj = A.get(i);
    	        } else {
    	            count--;
    	        }
    	    }
    	    
    	    count = 0;
    	    
    	    for (int i = 0; i < n; i++) {
    	        if (A.get(i) == maj)
    	            count++;
    	    }
    	    
    	    if (count > n / 2)
    	        return maj;
    	        
    	    return -1;
    	    
    	    
    	}

    
    public static void main(String args[]){
    	
    	ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(1);
		al.add(2);
		al.add(2);
    	
    	System.out.println(majorityElement(al));
    }
}
