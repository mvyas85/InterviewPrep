package sumWithoutPlusOrMinus;
/**
 * 371. Sum of Two Integers
 * @author vyasma1
 *
 */
public class SumWithoutPlusOrMinus {


	public static void main(String args[]){
		System.out.println(numSum(3,2));
	}

	public static int numSum(int a, int b){
		return b==0?a:numSum((a^b),(a&b)<<1);
	}
}
