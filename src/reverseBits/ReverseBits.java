package reverseBits;
/**
 * 190. Reverse Bits
 * 
Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).


 * @author vyasma1
 *
 */
public class ReverseBits {
	
	public static void main(String[] args) {
		System.out.println(reverseInt(1));
	}
	
	public static int reverseInt(int n){
		int ans = 0;
		for(int i=0;i<32;i++){
			System.out.println(Integer.toBinaryString(n>>i));
			System.out.println(Integer.toBinaryString((n>>i)&1));
			System.out.println(Integer.toBinaryString(ans<<1));
			ans = ans << 1;
			ans =ans + ((n>>i)&1);
		
			System.out.println(Integer.toBinaryString(ans));
			System.out.println("\n");
//			n =n>>1;
		}
		return ans;
	}

}
