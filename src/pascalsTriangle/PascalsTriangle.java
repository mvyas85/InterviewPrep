package pascalsTriangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

	public static void main(String args[]){
//		int[] arr = {};
		getRow(2);
	}
    public static List<Integer> getRow(int rowIndex) {

        List<Integer> ans = new ArrayList<Integer> ();
        ans.add(1);
        ans.add(1);
        List<Integer> temp = new ArrayList<Integer> ();

        
        for(int i=0;i<rowIndex-1;i++){
            
            temp.add(1);
            System.out.println(ans.size()-1);
            for(int j=1;j<ans.size();j++){
                temp.add(ans.get(j-1) + ans.get(j));
            }
            
            temp.add(1);
            ans = temp;
            temp = new ArrayList<Integer> ();
        }
        return  ans;
        
    }
}
