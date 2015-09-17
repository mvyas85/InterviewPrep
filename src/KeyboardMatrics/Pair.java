package KeyboardMatrics;
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//public class Solution {
//
//    /*
//     * Complete the method below which encodes 'textToEncode' using the
//     * transformations in'transformsToApply'.  You should not edit the 
//     * 'encode' method stub. 
//     * 
//     * transformsToApply - Comma separated list of transformations to
//     *  apply to keyboard (e.g. H,V,1,5,V,-10)
//     * textToEncode - Array of strings to encode with the transformed
//     *  keyboard
//     * returns String array containing encoded text
//     */
//    static String[] encodeText(String transformsToApply, String[] textToEncode) {
//        String encodedStr[] = {"",""};
//        
//        
//        char keys[][]={{'1','2','3','4','5','6','7','8','9','0'}
//                         ,{'q','w','e','r','t','y','u','i','o','p'}
//                         ,{'a','s','d','f','g','h','j','k','l',';'}
//                         ,{'z','x','c','v','b','n','m',',','.','/'}};
//        
//        
//        
//        Hashtable unencriptedValues = new Hashtable();
//        for(int i =0;i<4;i++)
//        {
//            for(int j =0;j<10;j++)
//            {
//                 unencriptedValues.put(keys[i][j],new Pair(i,j));
//            }
//        }
//        keys = positiveShift(keys,2);
//        
//        Hashtable encriptedValues = new Hashtable();
//        for(int i =0;i<4;i++)
//        {
//            for(int j =0;j<10;j++)
//            {
//                 encriptedValues.put(new Pair(i,j), keys[i][j]);
//            }
//        }
//        Pair pair = new Pair();
//        for(int i=0;i<textToEncode.length;i++){
//             for(int j=0;j<textToEncode[i].length();j++){
//                char aChar = textToEncode[i].charAt(i);
//
//                pair = (Pair) unencriptedValues.get(aChar);
//
//                char ans = (char) encriptedValues.get(pair);
//                System.out.println(ans);
//             }
//        }
//        
//        return encodedStr;
//    }
//    
//    static char[][] transformH(char[][] keys){
//        for(int i =0;i<4;i++)
//        {
//            for(int j =0,k=9;j<5;j++,k--)
//            {
//               char temp;
//                temp = keys[i][j];
//                keys[i][j] = keys[i][k];
//                keys[i][k] = temp;
//            }
//        }
//       return keys; 
//    }
//    static char[][] transformV(char[][] keys){
//        for(int i =0,k=3;i<2;i++,k--)
//        {
//               char[] temp;
//                temp = keys[i];
//                keys[i] = keys[k];
//                keys[k] = temp;
//        }
//       return keys; 
//    }
//    static char[][] positiveShift(char[][] keys, int places){
//
//        int itration=0;
//        while(itration<places){
//        
//            char temp = ' ';
//        char temp2 = keys[3][9];
//        for(int i =0;i<4;i++)
//        {
//            keys[i][0]= temp;
//            for(int j =9;j>1;j--)
//            {
//                temp = keys[i][j];
//                keys[i][j] = keys[i][j-1];
//                keys[i][j-1] = temp;
//            }
//         }
//        keys[0][0]= temp;
//        keys[0][1]=temp2;
//            itration++;
//        }
//        return keys;
//    }
//    static char[][] nagitiveShift(char[][] keys){
//         /*       int itration=0;
//        while(itration<places){
//        
//            char temp = ' ';
//        char temp2 = keys[0][0];
//        for(int i =0;i<4;i++)
//        {
//            keys[i][0]= temp;
//            for(int j =9;j>1;j--)
//            {
//                temp = keys[i][j];
//                keys[i][j] = keys[i][j-1];
//                keys[i][j-1] = temp;
//            }
//         }
//        keys[0][0]= temp;
//        keys[0][1]=temp2;
//            itration++;
//        }*/
//        // work in progress couldnt finish work.
//        return keys;
//    }
//
//public static class Pair {
//	int row;
//	int col;
//	
//	public Pair() {
//	}
//    
//    public Pair(int row, int col) {
//		super();
//		this.row = row;
//		this.col = col;
//	}
//	public int getRow() {
//		return row;
//	}
//	public void setRow(int row) {
//		this.row = row;
//	}
//	public int getCol() {
//		return col;
//	}
//	public void setCol(int col) {
//		this.col = col;
//	}
//}
//
///*
// * Gets the input, calls encodeText(), and returns the output.
// */
//public static void main(String[] args) throws IOException{
//    Scanner in = new Scanner(System.in);
//    final String fileName = System.getenv("OUTPUT_PATH");
//    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//    String[] res;
//    String _transformsToApply;
//    try {
//        _transformsToApply = in.nextLine();
//    } catch (Exception e) {
//        _transformsToApply = null;
//    }
//    
//    
//    int _textToEncode_size = Integer.parseInt(in.nextLine());
//    String[] _textToEncode = new String[_textToEncode_size];
//    String _textToEncode_item;
//    for(int _textToEncode_i = 0; _textToEncode_i < _textToEncode_size; _textToEncode_i++) {
//        try {
//            _textToEncode_item = in.nextLine();
//        } catch (Exception e) {
//            _textToEncode_item = null;
//        }
//        _textToEncode[_textToEncode_i] = _textToEncode_item;
//    }
//    
//    res = encodeText(_transformsToApply, _textToEncode);
//    for(int res_i=0; res_i < res.length; res_i++) {
//        bw.write(String.valueOf(res[res_i]));
//        bw.newLine();
//    }
//    
//    bw.close();
//}
//}