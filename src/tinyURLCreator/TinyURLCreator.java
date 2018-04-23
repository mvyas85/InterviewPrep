package tinyURLCreator;

import java.util.Hashtable;
import java.util.Random;

public class TinyURLCreator {

	
	public static void main(String args[]){
		String s = encode("adsfffffffffdfgrdfghiortjoigmkcv");
		System.out.println(s);
		System.out.println(decode(s));
		
	}
    public static final String URL_PREFIX = "http://myTinyURL/";

    static Hashtable<String,String> table = new Hashtable<>();

    public static String encode(String longUrl) {
        
    	StringBuilder encodedStr = new StringBuilder();
        
        for(char c:longUrl.toCharArray()){
            encodedStr.append((int)c);
            encodedStr.append('#');
        }
        
        String str = createRamdomStr(7);
        table.put(str,String.valueOf(encodedStr));
        String url = URL_PREFIX + str;
     
        return url;
    }
    
    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        if( shortUrl == null){return null;}
        
        int index = shortUrl.indexOf(URL_PREFIX);
        if( index == -1){return null;}
        
        String keyStr = shortUrl.substring(URL_PREFIX.length(),shortUrl.length());
        
        String url = table.get(keyStr);
        
        String[] strs = url.split("#");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<strs.length;i++){
            int num = Integer.parseInt(strs[i]);
            ans.append((char)num);
        }
        return String.valueOf(ans);
    }
    
    
    public static String createRamdomStr(int len){
    	StringBuilder sb = new StringBuilder();
    	Random rd = new Random();
    	for(int i=0;i<len;i++){
    		sb.append((char)(97+rd.nextInt(122-97)));
    	}
    	return String.valueOf(sb);
    }
}
