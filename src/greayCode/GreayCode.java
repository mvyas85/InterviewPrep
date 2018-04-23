package greayCode;

import java.util.ArrayList;
import java.util.List;

public class GreayCode {


	public static void main(String args[]){
		grayCode(3);
	}

    public static List<Integer> grayCode(int n) {
    	List<Integer> ans = new ArrayList<Integer>();
    	
    	for(int i=0;i< 1<<n;i++){

    		System.out.println(Integer.toBinaryString(1<<n));
    		System.out.print("i= \t\t");
    		System.out.println(Integer.toBinaryString(i));
    		System.out.print("i>>1= \t\t");
    		System.out.println(Integer.toBinaryString((i>>1)));
    		System.out.print("i ^ i>>1= \t");
    		System.out.println(Integer.toBinaryString((i ^ i>>1)));
    		System.out.println();


    		ans.add(i ^ i>>1);
    	}
    	return ans;
    }
}
