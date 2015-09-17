package fibonacciRecur;

public class FiboRecursion {
	public static void main(String args[]){
		
	System.out.println(fibbo(10));
	}
	public static int fibbo(int x){
		int ret;
		if(x ==0 || x ==1){
			ret = x;
		}
		else
			ret = fibbo(x -1) + fibbo(x-2);
		//System.out.println(ret);
		return ret;
	}
}
