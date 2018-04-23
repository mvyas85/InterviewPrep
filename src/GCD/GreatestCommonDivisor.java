package GCD;
/**
 * 
 
 Find greatest Common divisor GCD(54,24)=6


 70/28
 
 28 % 70 = 14
 
 14 % 28 
 
 * @author vyasma1
 *
 */
public class GreatestCommonDivisor {
	
	public static void main(String args[]){
		
		int valueA = 70;
		int valueB = 28;
		
		int ans = gcdRecursive(valueA,valueB);
		System.out.println("GCD("+valueA+","+valueB+")="+ans);
	}
	
	public static int gcdRecursive(int a, int b){
		
		while(a==0 || b ==0){ 
			return a+b;
		}
		return gcdRecursive(b, a%b);
		
		
	}
	
	public static int gcd(int a, int b){
		while (a!=0 && b!=0){
			int temp = b;
			b = a%b;
			a = temp;
			
		}
		return a+b;
	}

}
