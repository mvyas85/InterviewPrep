package primeNums;

public class PrintPrimes {

	public static void main(String args[]){
		printPrimes(20);
	}
	
	public static void printPrimes(int num){
		
		String primeNum = "";
		System.out.println();
		
		int count;
		primeNum += "1 ";
		for(int i = 1;i<= num;i++){
			count = 0;
			for(int j = 1 ; j<=i;j++){
				if(i%j == 0){
					count++;
				}
			}
			if(count == 2){ // if there are exact 2 modulo for a number Example 7 X 1 has only 2 multipliers
				primeNum += i + " ";
			}
		}

		System.out.println(primeNum);
		
	}
}
