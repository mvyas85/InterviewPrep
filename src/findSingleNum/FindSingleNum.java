package findSingleNum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class FindSingleNum {

	/**
	 * Given an array of integers, every element appears twice except for one. Find that single one.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example :

Input : [1 2 2 3 1]
Output : 3
	 * @param a
	 * @return
	 */
		// DO NOT MODIFY THE LIST
	public static int singleNumber(final List<Integer> a) {
	     Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
	     
	     int val[] = new int[a.size()];
	     for(int i =0;i< a.size();i++){
	         if(table.get(a.get(i)) == null){
	            table.put(a.get(i),1);
	         }else{
	             int inc = table.get(a.get(i));
	             table.put(a.get(i),++inc);
	         }
	     }

	     Set<Integer> keys = table.keySet();

	     for(int it:keys){
	    	 if(table.get(it) == 1){
	    		 return it;
	    	 }
	     }
	     return 0;
	}

	
	// DO NOT MODIFY THE LIST CORRECT SOLTION
	/*If you look at the bit operators, XOR is exactly what we need.

XOR will return 1 only on two different bits. So if two numbers are the same, XOR will return 0.

Finally, there is only one number left.

A ^ A = 0 and A ^ B ^ A = B.

So, all even occurences will cancel out using XOR.
*/
	public static int singleNumber1(final List<Integer> A) {
	    int num = 0;
	    
	    for (int val : A) {
	        num ^= val;
	    }
	    
	    return num;
	    
	}
	
	
		public static void main(String args[]){
			
			String str = "723,208, 256, 668, 723, 140, 360, 597, 233, 128, 845, 737, 804, 986, 701, 906, 512, 845, 510, 510, 227, 430, 701, 366, 946, 464, 619, 946, 627, 209, 771, 424, 555, 959, 711, 530, 937, 716, 261, 505, 658, 706, 140, 511, 277, 396, 233, 819, 196, 475, 906, 583, 261, 147, 658, 517, 197, 196, 702, 944, 711, 128, 555, 149, 483, 530, 291, 716, 258, 430, 464, 601, 749, 149, 415, 802, 573, 627, 771, 660, 601, 360, 986, 291, 51, 415, 51, 227, 258, 937, 366, 923, 669, 33, 517, 417, 702, 475, 706, 110, 417, 275, 804, 500, 473, 746, 973, 669, 275, 973, 147, 817, 657, 277, 923, 144, 660, 197, 511, 793, 893, 944, 505, 322, 817, 586, 512, 322, 668, 33, 424, 962, 597, 144, 746, 345, 753, 345, 269, 819, 483, 368, 802, 573, 962, 583, 615, 208, 209, 269, 749, 256, 657, 619, 893, 959, 473, 753, 299, 396, 299, 500, 368, 586, 110, 793, 737, 615 ";
			
			List<String> strList = new ArrayList<String>(Arrays.asList(str.split(",")));
			
			List<Integer> values = new ArrayList<Integer>();
			for(String s: strList){
				values.add(Integer.parseInt(s.trim()));
			}
			List<Integer> a = new ArrayList<Integer>();
			a.add(1);
			a.add(2);
			a.add(2);
			a.add(3);
			a.add(1);
			
			System.out.println(singleNumber1(values));
		}
}
