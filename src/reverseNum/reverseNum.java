package reverseNum;

public class reverseNum {
	public static void main(String args[]){
		
		int num = 234232;

		int temp;
		int revNum =0;
		while(num!=0){
			temp = num %10;
			revNum = temp + (revNum *10)  ;

			num = num/10;
		}
		System.out.println("Reverse tring is "+revNum);
		
	}
}
