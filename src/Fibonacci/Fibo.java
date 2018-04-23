/*
 * Fibonacci is series printing ::
 * 
 * example : 0 1 1 2 3 5 8 13 21 34 55 89 144
 *
 *
 *
 *
 *
 *
 *70. Climbing Stairs  <-------- related question for fibonacci
 *
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.


Input: 2
Output:  2
Explanation:  There are two ways to climb to the top.

1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output:  3
Explanation:  There are three ways to climb to the top.

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Input: 4
Output:  
Explanation:  There are three ways to climb to the top.

1. 1 step + 1 step + 1 step + 1 step
2. 2 step + 2 steps
3. 2 steps + 1 step + 1 step
4. 1 steps + 1 step + 2 step
5. 1 steps + 2 step + 1 step


int first = 1;
int second = 2;

for(int =3;i<=n;i++){
	third = first + second;
	first = second;
	second = third;
}
return second;



 */
package Fibonacci;

import java.util.Collections;

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
	
	//O(2^n)
	public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }
}
