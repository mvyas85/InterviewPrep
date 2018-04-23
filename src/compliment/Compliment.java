package compliment;
/**
 * 
 * 
 Find complement of a number 
 
 92:  1011100
      1111111 (xor)
     --------
      0100011 => 35
     

  101 (5)
  111 (XOR)
  010 (2)
  
  

     
 */

public class Compliment {

	public static void main(String args[]){
//		System.out.println( findComplement(5));
		
		System.out.println(complement(92));
		
	}
	
	public static int complement(int n){
		  int x =Integer.highestOneBit(n) ;
		  x = x<<1;
		  
		  x = x -1;
		  
		  int ans = x^n;
		  
		  return ans;
		  
	}
	
    public static int findComplement(int num) {
        
     String bNum = Integer.toString(num,2);
        
        
        String answer = "";
        
        for(int i=0;i<bNum.length();i++){
            if(bNum.charAt(i) == '0'){
                answer+= "1";
            }else{
                answer += "0";
            }
        }
        return Integer.parseInt(answer,2);
        }

    
}
