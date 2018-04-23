package facto;

import java.math.BigInteger;

/*
 * Factorial of 0 ! = 1
 * 1 ! = 1
 * 2 ! = 1 * 2 = 2
 * 3 ! = 1*2*3 = 6
 

 public int fact(int n){
 
 int ans = n;
 if(n==0 | n ==1){ return 1;}
 
  ans = ans * fact(n-1);// 3 * fact(2)
  						// 3 * 2 * fact(1);
  						// 3 * 2 * 1;
 return ans;
 
 // Non recursive
  if(n == 0 ){return 1;}
  int ans = 1;
  for(int i=1;i<=n;i++){
  	ans = ans*i;
  }
  return ans;
 
  

 */

public class Factorial {
	public static void main(String args[]){
		FindFactorialOf(15);
	}
	
	public static void FindFactorialOf(int x){
		if(x ==0){
			System.out.println("1");
			return ;
		}
		int ans = 1;
		
		for(int i=1;i<=x;i++){
			ans *= i;
		}
		System.out.println("Factorieal of "+ x + " is = "+ans);
	}
	
	
	public static void FindFactorialOverflow(int x){
		if(x ==0){
			System.out.println("1");
			return ;
		}
		BigInteger ans = BigInteger.ONE;
		
		for(int i=1;i<=x;i++){
			ans = ans.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Factorieal of "+ x + " is = "+ans);
	}
	
	public static int facto(int n)
	{
		int ans=n;
		if (n == 0 || n ==1){
			return 1;
		}
	
		ans = ans * facto(n-1);
		return ans;
	}
}
/*
public static void main(String args[]){

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

try {
	System.out.println("Enter a number to find factorial");
	int n = Integer.parseInt(br.readLine());
	
	facto(n);
	
	System.out.println("ans is : " +facto(n));
} catch (IOException e) {
	e.printStackTrace();
}

}

public static int facto(int n)
{
int ans=n;
if (n == 0 || n ==1){
	return 1;
}

ans = ans * facto(n-1);
return ans;

}*/