package selfDividingNum;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNum {

	public static void main(String args[]){
		List<Integer> list = selfDividingNumbers(1,22);
		
		for(int a : list){
			System.out.println(a);
		}
	}
	   public static List<Integer> selfDividingNumbers(int left, int right) {
	        List<Integer> answer = new ArrayList<Integer>();
	        int reminder;
	        for(int i=left;i<=right;i++){
	            int num = i;
	            boolean isSDN = true;
	            while(num>0){
	                reminder = num % 10;
	                if(i%reminder != 0){
	                    isSDN = false;
	                }
	                num = num/10;
	            }
	            if(isSDN){
	                answer.add(i);
	            }
	        }
	        return answer;
	    }
}
