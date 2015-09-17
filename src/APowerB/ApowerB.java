package APowerB;
/*
 * 3) Write a function that takes in two integers (a and b) and returns a^b. You cannot use any 
 * exponents or predefined language functions other than basic arithmetic (addition, subtraction, 
 * multiplication, division). Comment on the complexity of your solution.
 */
import java.util.Scanner;

//O(log(n)) complexity
public class ApowerB {

	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value for x:");
		int a = in.nextInt();
		System.out.println("Enter value for y:");
		int b = in.nextInt();
		
		System.out.println(power(a,b));
	}
	
	public static double power(double x, int n){
		 if(n==0){
			  return 1;
		 }

		 if(n<0){
			 x = 1.0/x;
			 n = -n;
		 }
		  
		 double ret = power(x,n/2);
		 ret = ret * ret;
		 
		 if(n%2!=0){
		   ret = ret * x;
		 }
		 return ret;
	}
}

