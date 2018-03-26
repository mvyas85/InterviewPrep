package sortCharByFreq;


import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortCharByFrequency {
	

	public static void main(String args[]){
		System.out.println(frequencySort("tree"));
	}

    public static String frequencySort(String s) {
    	if(s.length()<=2){return s;}
    	
    	int[] arr = new int[256];
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i=0;i<s.length();i++){
    		arr[s.charAt(i)]++;
    	}
    	
    	for(int i=0;i<s.length();i++){
    		
    			int max=0;
    			int index=0;
    			for(int j=0;j<arr.length;j++){
    				if(arr[j]!=0){
    				if(arr[j]>max){
    					max = arr[j];
    					index = j;
    				}
    				}
    			}
    			
    			while(max>0){
    				sb.append((char)index);
    				max--;
    			}
    			arr[index] =0;

    	}
    	
    	
    	return sb.toString();
    }

}