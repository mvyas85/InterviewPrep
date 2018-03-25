package primeNums;

import java.util.List;

public class PrintPrimes {

	public static void main(String args[]){
//		printPrimes(499979);
		System.out.println(countPrimes(499979));
	}
	

    public static int countPrimes(int n) {
    	
    if(n<=2){return 0;}
    int count = 0;
    boolean[] notPrime = new boolean[n];
    for( int i=2;i<n;i++){
        if(notPrime[i] ==  false){
        	for(int j=2;i*j<n;j++){
        		count++;
        		notPrime[i] = true;
        	}
        }
    }
    
    for(boolean b: notPrime){
        if(!b){ count++;}
    }
    return count;
    }
}
	
//
//	public static int countPrintPrimes(int n){
//		
//		if(n<=1 )return 0;
//		
//		boolean[] notPrime = new boolean[n];
//		int count = 0;
//		for(int i = 2; i<n; i++){
//			if(!notPrime[i]){
//				count++;
//				for(int j=2;i*j<n;j++){
//					notPrime[i*j] =  true;
//				}
//			}
//		}
//		return count;
//	}
//	
//	
//	//Bad O(----)
//	public static void printPrimes(int num){
//		
//		String primeNum = "";
//		System.out.println();
//		
//		int count;
//		primeNum += "1 ";
//		for(int i = 1;i<= num;i++){
//			count = 0;
//			for(int j = 1 ; j<=i;j++){
//				if(i%j == 0){
//					count++;
//				}
//			}
//			if(count == 2){ // if there are exact 2 modulo for a number Example 7 X 1 has only 2 multipliers
//				primeNum += i + " ";
//			}
//		}
//
//		System.out.println(primeNum);
//		
//	}
//}



/*
if(n<=2){return 0;}
int count = 0;
boolean[] notPrime = new boolean[n];
notPrime[0] = true;
notPrime[1] = true;
for( int i=2;i<n;i++){
    int temp = i * i;
    while(temp<n){
        if(notPrime[i*i] == false){
            notPrime[i*i] = true;
        }
        temp = temp * i;
    }
}

for(boolean b: notPrime){
    if(!b){ count++;}
}
return count;
}
// int count = 0;
// for(int i=1;i<n;i++){
//     int divisables = 0;
        
//     for(int j=1;j<=i;j++){
        
//         if(i%j == 0){
//             divisables++;
//         }
        
//     }
    
//         if(divisables == 2){
//             count++;
//         }
// }
// return count;

//}
*/