package primeNumSum;

import java.util.Scanner;

/*
 * 
 * 
 * 	
Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s conjecture

Example:


Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d] 

If a < c OR a==c AND b < d. 



 */
public class PrimeNumSum {   
	public static void main (String[] args)
{		
    Scanner scanner = new Scanner(System.in);
    int i =0;
    int num =0;
    //Empty String
    String  primeNumbers = "";
    System.out.println("Enter the value of n:");
    int n = scanner.nextInt();
    scanner.close();
    for (i = 1; i <= n; i++)  	   
    { 		 		  
       int counter=0; 		  
       for(num =i; num>=1; num--)
       {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    //Appended the Prime number to the String
	    primeNumbers = primeNumbers + i + " ";
	 }	
    }	
    System.out.println("Prime numbers from 1 to n are :");
    System.out.println(primeNumbers);
 }

}
