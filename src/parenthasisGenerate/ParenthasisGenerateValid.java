package parenthasisGenerate;
/**
 * 22. Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]



[[], [()], [()(), (())], [()()(), ()(()), (())(), (()()), ((()))]]


[[], [()], [()(), (())], [()()(), ()(()), (())(), (()()), ((()))], [()()()(), ()()(()), ()(())(), ()(()()), ()((())), (())()(), (())(()), (()())(), ((()))(), (()()()), (()(())), ((())()), ((()())), (((())))]]


 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParenthasisGenerateValid {

	public static void main(String args[]){
		System.out.println(generateParenthesis(3));
	}

	public static List<String> generatePara(int n){
		List<String> list = new ArrayList<String>();
		generateOneByOne("",list,n,n);
		return list;
	}

	private static void generateOneByOne(String sublist, List<String> list, int left, int right) {
		if(left>right){return;}
		
		if(left>0){
			generateOneByOne(sublist+"(",list,left-1,right);
		}
		if(right>0){
			generateOneByOne(sublist+")",list,left,right-1);
		}
		if(left==0 && right ==0){
			list.add(sublist);
			return;
		}
	}
	
	   public static List<String> generateParenthesis(int n)
	    {
	        List<List<String>> lists = new ArrayList<>();
	        lists.add(Collections.singletonList(""));
	        
	        for (int i = 1; i <= n; ++i)
	        {
	            final List<String> list = new ArrayList<>();
	            
	            for (int j = 0; j < i; ++j)
	            {
	                for (final String first : lists.get(j))
	                {
	                    for (final String second : lists.get(i - 1 - j))
	                    {
	                        list.add("(" + first + ")" + second);
	                    }
	                }
	            }
	            
	            lists.add(list);
	        }
	        
	        return lists.get(lists.size() - 1);
	    }
}
