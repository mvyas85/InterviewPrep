package fbBulb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  N light bulbs are connected by a wire. Each bulb has a switch associated with it,
 *  however due to faulty wiring, a switch also changes the state of all the bulbs to
 *  the right of current bulb. Given an initial state of all bulbs, find the minimum 
 *  number of switches you have to press to turn on all the bulbs. You can press the
 *  same switch multiple times.

Note : 0 represents the bulb is off and 1 represents the bulb is on.

Example:

Input : [0 1 0 1]
Return : 4

Explanation :
	press switch 0 : [1 0 1 0]
	press switch 1 : [1 1 0 1]
	press switch 2 : [1 1 1 0]
	press switch 3 : [1 1 1 1]

 * @author vyasma1
 *
 */
public class FBBlulb {
	
	public static void main(String args[]){
		List<Integer> arr = Arrays.asList(0,1,0,1);
		System.out.println(bulbs(arr));
	}
	  public static int bulbs(List<Integer> a) {
	        int state = 0;
	        int switches = 0;
	        for (int i=0; i< a.size(); i++){
	            if (state == a.get(i)) {
	                state = 1 - state;
	                switches++;
	            }
	        }
	        return switches;
	    }
}
