package validParanthasesStr;

import java.util.Stack;

public class ValidParanthasesStr {

	
	public static void main(String args[]){
		System.out.println(isValid("(])"));
	}
	
    public String reverseVowels(String s) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                sb.append(c);
            }
        }
        char[] str = s.toCharArray();
        for(int i=0, j = 0;i<str.length;i++){
            char c = str[i];
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                str[i]= sb.charAt(j);
                j++;
            }
        }
        return str.toString();
    }
    
    public static boolean isValid(String s) {
        Stack<Character> par = new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                par.push(c);
            }
            char top;
            if(c == ')' || c == '}' || c == ']'){
                if(par.isEmpty()){
                    return false;
                }
                top = par.peek();
                switch(top){
                    case '(':
                        if(c == ')') par.pop();
                        break;
                    case '{':
                        if(c == '}') par.pop();
                        break;
                    case '[':
                        if(c == ']') par.pop();
                        break;
                    default:
                        par.push(c);
                        break;
                }
                
            }
        }
        if(par.isEmpty()){
            return true;
        }
        return false;
        
    }
}
