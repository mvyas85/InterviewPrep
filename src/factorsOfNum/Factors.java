package factorsOfNum;

import java.util.ArrayList;
import java.util.List;

public class Factors {
	
	public static void main(String args[]){
		System.out.println(getFactors(81));
	}
	
	public static List<Integer> getFactors(int n){
		List<Integer> ans = new ArrayList<Integer>();
		for(int i=1;i<=Math.sqrt(n);i++){
			if(n%i==0){
				ans.add(i);
				if(i!=n/i){
					ans.add(n/i);
				}
			}

		}
		return ans;
	}

}
