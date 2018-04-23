package maxValFromStringNum;
/**
 * 
Given a string of numbers, the task is to find the maximum value from the string, 
you can add a ‘+’ or ‘*’ sign between any two numbers.
Note: Add sign between two numbers on the basis of numbers not on the value calculated till that number.
For eg: n = 5120    
(((5  + 1 )  + 2 )  + 0 ) = 8 is right.

5120   
(((5  + 1 )  * 2 )  + 0 ) =  12 is wrong.


 * @author vyasma1
 *
 */
public class MaxValFromStringNum {
	  // Mehod to calculate the value
    static int calcMaxValue(String str)
    {
        // Store first character as integer
        // in result
        int res = str.charAt(0) -'0';
        // Start traversing the string
        for (int i = 1; i < str.length(); i++)
        {
            // Check if any of the two numbers
            // is 0 or 1, If yes then add current
            // element
            if (str.charAt(i) == '0' || str.charAt(i) == '1' ||
                str.charAt(i-1) == '0' || str.charAt(i-1) == '1' )
                res += (str.charAt(i)-'0');
      
            // Else multiply
            else
                res *= (str.charAt(i)-'0');
        }
      
        // Return maximum value
        return res;
    }
     
    // Driver Method
    public static void main(String[] args)
    {
        String str = "3155";
        System.out.println(calcMaxValue(str));
    }
}
