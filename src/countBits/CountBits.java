package countBits;
/**
 * 
 * Write a function that takes an unsigned integer and returns the number of 1 bits it has.

Example:

The 32-bit integer 11 has binary representation

00000000000000000000000000001011
so the function should return 3.

Note that since Java does not have unsigned int, use long for Java



 * @author vyasma1
 *
 */
public class CountBits {

	public static void main(String args[]){
		System.out.println(countBits(15));
	}
	public static int countBits(long a){
		
		int count = 0 ;
		
		for(int i = 0;i<32;i++){
			count += (a&1);
			a = a >> 1;
		}
		return count;
	}
}
