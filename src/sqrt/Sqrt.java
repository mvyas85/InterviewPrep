package sqrt;
public class Sqrt {
	

	public static void main(String args[]){
		
		System.out.println(sqrt(3));
	}
	
	public static double sqrt(int n){
		
		double sqrt = n/2;
		
		double t ;
		do{
			t = sqrt;
			sqrt = (t + (n/t))/2;
			
			
		}while(t - sqrt != 0 );
		
		return sqrt;
	}
}
