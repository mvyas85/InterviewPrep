package compliment;

import java.util.List;
import java.util.Set;

public class Compliment {

	public static void main(String args[]){
//		System.out.println( findComplement(5));
		
		System.out.println(2^111);
		
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
