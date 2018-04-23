package decodeString;

public class DecodeString {
	static int pos = 0;
	public static void main(String args[]){
		System.out.println(decodeString("3[a]2[bc]"));

	}

	public static String decodeString(String s) {

        if(s ==null || s.length() == 0){return s;}
        String num = "";
        StringBuilder sb = new StringBuilder();
        for(int i=pos;i<s.length();i++){
            if(s.charAt(i) != '[' && s.charAt(i) != ']' && !Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }else if(Character.isDigit(s.charAt(i))){
                num += s.charAt(i);
            }else if(s.charAt(i) == '['){
                pos = i + 1;
                String next = decodeString(s);
                for(int j=Integer.parseInt(num);j>0;j--){sb.append(next);}
                num = "";
                i = pos;
            }else if(s.charAt(i) == ']'){
                pos = i;
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
