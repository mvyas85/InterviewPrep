package wordLadder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>(Arrays.asList("hot","dot","dog","lot","log","cog"));
		System.out.println(ladderLength("hit","cog",words));
	}
	

	//BFS
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
    	
    	Queue<String> q = new LinkedList<>();
    	q.add(beginWord);
    	int level = 0;
    	
    	while(!q.isEmpty()){
    		int size = q.size();
    		while(size-- >0){
	    		String cur = q.poll();
	    		if(cur.equals(endWord)){return level+1;}
	    		for(int j = 0;j<cur.length();j++){
		    		char[] word = cur.toCharArray();
	    			for(char ch = 'a';ch<='z';ch++){
	    				word[j] = ch;
	    				String newWord = String.valueOf(word);
	    				if(!newWord.equals(cur) && wordList.contains(newWord)){
	    					wordList.remove(newWord);
	    					q.offer(newWord);
	    				}else;
	    			}
	    		}
    		}
    		level++;
    	}
    	return 0;
    }
}
