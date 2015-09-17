package KeyboardMatrics;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import KeyboardMatrics.Solution.Pair;
public class Solution {

    /*
     * Complete the method below which encodes 'textToEncode' using the
     * transformations in'transformsToApply'.  You should not edit the 
     * 'encode' method stub. 
     * 
     * transformsToApply - Comma separated list of transformations to
     *  apply to keyboard (e.g. H,V,1,5,V,-10)
     * textToEncode - Array of strings to encode with the transformed
     *  keyboard
     * returns String array containing encoded text
     */
    static String[] encodeText(String transformsToApply, String[] textToEncode) {
        String encodedStr[] = {"",""};
        
        
        char keys[][]={{'1','2','3','4','5','6','7','8','9','0'}
                         ,{'q','w','e','r','t','y','u','i','o','p'}
                         ,{'a','s','d','f','g','h','j','k','l',';'}
                         ,{'z','x','c','v','b','n','m',',','.','/'}};

        Hashtable<Character, Pair> unencriptedValues = new Hashtable<Character, Pair>();

        Hashtable<Pair, Character> encriptedValues = new Hashtable<Pair, Character>();
        
        //Creating Hashtable for unencriptedValues
        for(int i =0;i<4;i++)
        {
            for(int j =0;j<10;j++)
            {
            	//System.out.println(keys[i][j]+"="+i+j);
                 unencriptedValues.put(keys[i][j],new Pair(i,j));
            }
        }
        

    	StringTokenizer st = new StringTokenizer(transformsToApply);
    	while (st.hasMoreTokens()) {
    		  String temp = st.nextToken();
        //for(int i=0;i<transformsToApply.length();i++){
        	
        		//char temp = transformsToApply.charAt(i);

    			System.out.println("Num"+temp);
        		if(temp=="H"){
        			System.out.println("Horizontal Transform");
        			keys = transformH(keys);
        		}else if (temp=="V"){
        			System.out.println("Horizontal Transform");
        			keys = transformV(keys);
        		}else{
            			int num = Integer.parseInt(temp+"");
            			System.out.println("Num"+num);
            			if(num>0){
                			System.out.println("Positive shift");
            				keys = positiveShift(keys,num);
            			}else{
                			System.out.println("Nagative shift");
            				keys = nagitiveShift(keys,num);
            			}
        		}
        }
        
        //Creating Hashtable for encriptedValues
        for(int i =0;i<4;i++)
        {
            for(int j =0;j<10;j++)
            {
            	System.out.println(keys[i][j]+"="+i+j);
                 encriptedValues.put(new Pair(i,j), keys[i][j]);
            }
        }  
        
        Pair pair = new Pair();
        for(int i=0;i<textToEncode.length;i++){
             for(int j=0;j<textToEncode[i].length();j++){
          
                char aChar = textToEncode[i].charAt(j);

          		if(!unencriptedValues.containsKey(aChar)){
          			encodedStr[i] += aChar;
        			continue;
        		}
                pair = (Pair) unencriptedValues.get(aChar);
                char ans = (char) encriptedValues.get(pair);
                encodedStr[i] += ans;
             }
        }
        return encodedStr;
    }
    
    static char[][] transformH(char[][] keys){
        for(int i =0;i<4;i++)
        {
            for(int j =0,k=9;j<5;j++,k--)
            {
               char temp;
                temp = keys[i][j];
                keys[i][j] = keys[i][k];
                keys[i][k] = temp;
            }
        }
       return keys; 
    }
    static char[][] transformV(char[][] keys){
        for(int i =0,k=3;i<2;i++,k--)
        {
               char[] temp;
                temp = keys[i];
                keys[i] = keys[k];
                keys[k] = temp;
        }
       return keys; 
    }
    static char[][] positiveShift(char[][] keys, int places){

        int itration=0;
        while(itration<places){
        
            char temp = ' ';
	        char temp2 = keys[0][0];
	        for(int i =0;i<4;i++)
	        {
	            keys[i][0]= temp;
	            for(int j =9;j>1;j--)
	            {
	                temp = keys[i][j];
	                keys[i][j] = keys[i][j-1];
	                keys[i][j-1] = temp;
	            }
	         }
	        keys[0][0]= temp;
	        keys[0][1]= temp2;
	        itration++;
        }
        return keys;
    }
    static char[][] nagitiveShift(char[][] keys, int places){

    	places = places * -1;
        int itration=0;
        while(itration<places){
        
        char temp = ' ';
        char temp2 = keys[3][9];
        for(int i =3;i>=0;i--)
        {
            keys[i][9]= temp;
            for(int j =0;j<9;j++)
            {
                temp = keys[i][j];
                keys[i][j] = keys[i][j+1];
                keys[i][j+1] = temp;
            }
        }
        keys[3][9]= temp;
        keys[3][8]=temp2;
        itration++;
        }
        return keys;
    }

public static class Pair {
	int row;
	int col;
	
	public Pair() {
	}
    
    public Pair(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
		result = prime * result + row;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (col != other.col)
			return false;
		if (row != other.row)
			return false;
		return true;
	}	
}

/*
 * Gets the input, calls encodeText(), and returns the output.
 */
public static void main(String[] args) throws IOException{
     String[] res;
	 String _transformsToApply ="-2";
	 String _textToEncode[] = {"p}p2"};
	    
	    res = encodeText(_transformsToApply, _textToEncode);
	    for(int res_i=0; res_i < res.length; res_i++) {
	    	System.out.print(res[res_i]);
	    }
	    
	}
}