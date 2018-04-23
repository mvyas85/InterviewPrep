package findCelebrity;


//Amazon interview question bank
public class FindCelebrity {

	//https://aquahillcf.wordpress.com/2015/09/06/leetcode-find-the-celebrity/
	
	
	public static void main(String args[]){
		
	}
	
	public static int findCelibrity(int[] n){
		
		int l = 0;
		int r = n.length -1;
		
		while(l<r){
			if(knows(l,r)){
				l++;
			}else{
				r--;
			}
		}
		
		for(int i=0;i<n.length;i++){
			if(i != l){
				if(knows(l,i) && !knows(i,l)){
					return -1;
				}
			}
		}
		return l;
	}

	private static boolean knows(int l, int r) {
		//Dummy function
		return false;
	}
}
