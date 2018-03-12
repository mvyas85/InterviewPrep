package GCD;

public class GreatestCommonDivisor {
	
	public static void main(String args[]){
		
		int valueA = 54;
		int valueB = 24;
		
		int ans = gcd(54,24);
		System.out.println("GCD("+valueA+","+valueB+")="+ans);
	}
	
	public static int gcdRecursive(int a, int b){
		
		while(a==0 || a ==b){ 
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
