package TripletWithSum0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TripletWithSum0 {
	
public static void main(String args[]){
		
		List<Integer> arr = Arrays.asList(1,4,-5);
		
		System.out.println(findK(arr));
	}
	
	public static boolean findK(final List<Integer> arr){

		Collections.sort(arr);
		
		for( int i = 0;i<arr.size();i++){
			int l = i + 1;
			int r = arr.size() - 1 ;
			int x = arr.get(i);
			
			while (l<r){
				if(x+arr.get(l)+arr.get(r)==0){
					return true;
				}else if(x+arr.get(l)+arr.get(r)>0){
					r--;
				}else{
					l++;
				}
			}
		}
		return false;
	}

}
