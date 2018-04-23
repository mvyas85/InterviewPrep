package skyLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
/*
 * 19 8 s
 * 24 8 e
 * 2 10 s
 * 2 11 s
 * 9 10 e 
 * 6 11 e
 * 3 15 s
 * 7 15 e
 * 5 12 s
 * 5 12 e
 * 15 10 s
 * 20 10 e
 * 
 * 
 *  1 5 s
 *  3 5 e
 *  2 7 s
 *  5 7 e
 *  4 5 s
 *  6 5 e
 *  
 *  1 5 s
 *  2 7 s
 *  3 5 e
 *  4 5 s
 *  5 7 e
 *  6 5 e
 * 
 */
public class SkyLine {
	
	public static void main(String args[]){

//		int[][] arr = {  {19, 24, 8} ,{2, 9, 10}, {2, 6, 11}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}};
//		int[][] arr = {{1,3,5}, {2,5,7}, {4,6,5}};
//		int[][] arr = {{0,1,2}, {0,2,3}}; //edge case - 1
//		int[][] arr = {{3,5,3}, {4,5,2}}; //edge case - 2
		int[][] arr = {{6,7,2}, {7,8,3}}; //edge case - 3
		getSkyline(arr);
	}
	

    static class Pairs{
        public int start;
        public int height;
        public int isStart;
        public Pairs (int start,int end,int isStart){
            this.start = start;
            this.height = end;
            this.isStart = isStart;
        }
        @Override
        public String toString() {
        	String str = "["+start+","+height+","+isStart+"]";
        	return str;
        }
    }
    public static List<int[]> getSkyline(int[][] buildings) {
        //Edge case revit --- 
        // Create array of heightPairs
        
        Pairs[] pairs = new Pairs[buildings.length * 2];
        
        for(int i=0, j=-1;i<buildings.length;i++){
            int start = buildings[i][0];
            int end = buildings[i][1];
            int height = buildings[i][2];
            
            pairs[++j] = new Pairs(start,height,0);
            pairs[++j] = new Pairs(end,height,1);
        }
        
        //Sort the array
        Arrays.sort(pairs,new Comparator<Pairs>(){
            public int compare(Pairs p1,Pairs p2){
                
                if(p1.start != p2.start){return p1.start - p2.start;}
                else{
                    if(p1.isStart == 0 && p1.isStart == p2.isStart){
                        return p2.height - p1.height;
                    }else if(p1.isStart == 1 && p1.isStart == p2.isStart){
                    	return p1.height - p2.height;
                    }else if(p1.isStart != p2.isStart){
                        return p1.isStart - p2.isStart;
                    }
                }
                return 0;
            }
        });
        
        List<int[]> ans = new ArrayList<int[]>();
        //Create PQ and do the adding and sorting operation
        
        Queue<Integer> q = new PriorityQueue<Integer>(10,Collections.reverseOrder());
        q.add(0);
        int max = 0;
        for(int i=0;i<pairs.length;i++){
        	max = q.peek();
        	if(pairs[i].isStart == 0){
        		q.offer(pairs[i].height);
        	}else{
    			q.remove(pairs[i].height);
    		}        		
        	int newMax = q.peek();
        	if(newMax != max){
        		int[] temp = {pairs[i].start,newMax};
    			ans.add(temp);
    			
    		}
        }
		return ans;
        
    }
}
