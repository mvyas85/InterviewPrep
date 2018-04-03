package arrPalindromicSubstring;
//Answer try failed.. Need to look at https://leetcode.com/problems/palindromic-substrings/description/
import java.util.ArrayList;
import java.util.List;

public class ArrPalindromicSubstring {
	
	public static void main (String args[]){
		System.out.println(countSubstrings("abc"));
	}
    public static int countSubstrings(String s) {
        List<String> list = new ArrayList<String>();
        backtrack(list,"",s,0);
        return list.size();
    }
    
    public static void backtrack(List<String> list,String temp,String s,int start){
        
        list.add(temp);
        for(int i = start;i<s.length() || !s.equals("");i++){
            if(isPalindrome(temp,start,i)){
                temp = s.substring(start,i+1);
                backtrack(list,temp,s,i+1);
                temp = temp.substring(0,temp.length()-1);
            }
        }
    }
    
    public static boolean isPalindrome(String str,int l,int r){
        while(l<r){
            if (str.charAt(l++) != str.charAt(r--)){return false;}
        }
        return true;
    }

}
