package facto;
/*
 * Factorial of 0 ! = 1
 * 1 ! = 1
 * 2 ! = 1 * 2 = 2
 * 3 ! = 1*2*3 = 6
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String args[]){
		FindFactorialOf(7);
	}
	
	public static void FindFactorialOf(int x){
		if(x ==0){
			System.out.println("1");
			return ;
		}
		int ans=1;
		
		for(int i=1;i<=x;i++){
			ans *= i;
		}
		System.out.println("Factorieal of "+x + " is = "+ans);
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