/*
 * Fibonacci is series printing ::
 * 
 * example : 0 1 1 2 3 5 8 13 21 34 55 89 144
 * 
 */
package Fibonacci;

public class Fibo {
	public static void main(String args[]){
		PrintFiboTill(100);
		System.out.println("\nRecursive approach :");
		 for (int i = 0; i <= 10; i++)
	            System.out.print(fib(i) + " ");
	}
	
	public static void PrintFiboTill(int x){
		
		if(x == 0 ){
			System.out.println("0");
			return;
		}
		int firstNum = 0;
		int secondNum = 1;
		int sum =0;

		System.out.print(firstNum + " " + secondNum + " ");
		while (true){
			sum = firstNum + secondNum;
			if(sum>x){
				break;
			}
			firstNum = secondNum;
			secondNum = sum;
			System.out.print(sum + " ");
			
		}
	}
	
	public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }
}
