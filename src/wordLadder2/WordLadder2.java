package wordLadder2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder2 {
/*
 * "hit"
"cog"
["hot","dot","dog","lot","log"]
 */
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>(Arrays.asList("hot","dot","dog","lot","log"));
		System.out.println(findLadders("hit", "cog", words));
	}
	
	
    //ladder word with its depth
    static HashMap<String,Integer> path = new HashMap<>();
    
    public static List<List<String>> findLadders(String start, String end, List<String> wordList) {
        List<List<String>> ans = new ArrayList<List<String>>();
        HashSet<String> set = new HashSet<>(wordList);
        
        bfs(start,end,set);
        dfs(end,start,new ArrayList<String>(),ans);
        
        return ans;
    }
    
    public static void dfs(String start,String end,List<String> temp,List<List<String>> ans){
        
        if(start.equals(end)){
            temp.add(start);
            Collections.reverse(temp);
            ans.add(temp);
            return;
        }
        
        
        temp.add(start);
        
        for(int i=0;i<start.length();i++){
            char[] word = start.toCharArray();
            for(char c='a';c<='z';c++){
                word[i]=c;
                String newWord = String.valueOf(word);
                if(!newWord.equals(start) && path.get(newWord) != null && path.get(newWord) == path.get(start)-1){
                    dfs(newWord,end,new ArrayList<>(temp),ans);
                }
            }
        }
        
    }
    
    public static void bfs(String start, String end, Set<String> wordList){
        
        Queue<String> q = new LinkedList<>();
        q.offer(start);
        path.put(start,0);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            while (size-- >0){
                String cur = q.poll();
                
                if(cur.equals(end)){continue;}
                for(int i=0;i<cur.length();i++){
                    char[] word = cur.toCharArray();
                    
                    for(char c='a';c<='z';c++){
                        word[i] = c;
                        String newWord = String.valueOf(word);
                        
                        if(!newWord.equals(cur) && wordList.contains(newWord) && path.get(newWord) == null){
                            int depth = path.get(cur);
                            path.put(newWord,depth+1);
                            q.offer(newWord);
                        }
                    }
                    
                }
            }
        }
        
    }
    
    
    
//
//	// use a hashmap to store words and their corresponding depths.
//	static HashMap<String, Integer> path = new HashMap<String, Integer>();
//
//	public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
//		List<List<String>> res = new ArrayList<>();
//		List<String> tmp = new ArrayList<>();
//		Set<String> set = new HashSet<>(wordList);
//
//		bfs(beginWord, endWord, set);
//		dfs(endWord, beginWord, set, tmp, res);
//		return res;
//	}
//
//	private static void dfs(String beginWord, String endWord, Set<String> set, List<String> tempPath, List<List<String>> res) {
//		
//		if (beginWord.equals(endWord)) {
//			tempPath.add(beginWord);
//			Collections.reverse(tempPath);
//			res.add(tempPath);
//			return;
//		}
//		
//		if (path.get(beginWord) == null){return;}
//		tempPath.add(beginWord);
//		int nextDepth = (int) path.get(beginWord) - 1;
//		
//		for (int i = 0; i < beginWord.length(); i++) {
//			char[] word = beginWord.toCharArray();
//			for (char c = 'a'; c <= 'z'; c++) {
//				word[i] = c;
//				String newWord = String.valueOf(word);
//				
//				if (!newWord.equals(beginWord) 
//						&& path.get(newWord) != null 
//						&& path.get(newWord) == nextDepth) {
//					
//					List<String> new_tmp_path = new ArrayList<>(tempPath);
//					dfs(newWord, endWord, set, new_tmp_path, res);
//				}
//			}
//		}
//	}
//
//	private static void bfs(String start, String end, Set<String> set) {
//		Queue<String> q = new LinkedList<>();
//		q.offer(start);
//		path.put(start, 0);
//
//		while (!q.isEmpty()) {
//			int size = q.size();
//			while (size-- > 0) {// dont really require saves 100 ms
//				String cur = q.poll();
//				if (cur.equals(end)) {
//					continue;
//				}
//				for (int i = 0; i < cur.length(); i++) {
//					char[] word = cur.toCharArray();
//					for (char c = 'a'; c <= 'z'; c++) {
//						word[i] = c;
//						String newWord = new String(word);
//						if (!newWord.equals(cur) && set.contains(newWord)) {
//							if (path.get(newWord) == null) {
//								int depth = path.get(cur);
//								path.put(newWord, depth + 1);
//								q.offer(newWord);
//							}
//						}
//					}
//				}
//			}
//		}
//	}
}