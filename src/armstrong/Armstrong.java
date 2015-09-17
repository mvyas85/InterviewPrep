/*
 * 371 = 3^3 + 7^3 + 1^3
 * 1^4 + 6^4 + 3^4 + 4^4 = 1634
 * 1^3 + 5^3 + 3^3 = 153
 * 1741725 = 1^7 + 7^7 + 4^7 + 1^7 + 7^7 + 2^7 +5^7
 * 8208 = 8^4 + 2^4 +0^4 + 8^4
 * 
 */
package armstrong;

import java.util.Scanner;;
public class Armstrong {

	public static void main(String[] args) {
		
		int x,x1,sum =0,d;
		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		
		x = sc.nextInt();
		x1 = x;
		int digits = new Integer(x).toString().length();
		while (x>0){
			d = x%10;
			sum = sum +raiseTo(d,digits);
			x = x/10;
		}
		
		if(sum == x1){
			System.out.println("Armstrong");
		}else{
			System.out.println("Not Armstrong");
		}

	}
	
	public static int raiseTo(int d,int x){
		int ans=1;
		for(int i=0;i<x;i++){
			ans = ans * d;
		}
		return ans;
	}

}
