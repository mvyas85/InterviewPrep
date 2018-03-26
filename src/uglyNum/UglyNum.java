package uglyNum;

import java.util.ArrayList;

public class UglyNum {
	
	public static void main(String args[]){
		System.out.println(isUgly(214797179));
	}
	
    public static boolean isUgly(int num) {
        
    
    	num = Math.abs(num);
        ArrayList<Integer> primes = primeList(num);
        boolean isUngly = true;
        
        for(int n:primes){
            if(num%n == 0){
            	isUngly = false;
                break;
            }
        }
        return isUngly;
    }
    
    public static ArrayList<Integer> primeList(int num){
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        for(int i=7;i<=num;i++){
            int count = 0;
            for(int j=1;j<=i;j++){
                if(i%j ==0){
                    count++;
                }
            }
            if(count == 2){
                nums.add(i);        
            }
        }
        return nums;
    }
}
